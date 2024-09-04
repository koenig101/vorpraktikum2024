#include <stdio.h>
#include <ctype.h>

#define ALPHABET_SIZE 26

void readFileAndCountFrequency(const char *filename)
{
    FILE *file = fopen(filename, "r");
    if (file == NULL)
    {
        perror("Fehler beim Öffnen der Datei");
        return;
    }

    int frequency[ALPHABET_SIZE] = {0};
    int c;

    while ((c = fgetc(file)) != EOF)
    {
        if (isalpha(c))
        {
            putchar(c);
            c = tolower(c); // Groß- und Kleinbuchstaben zusammenfassen
            frequency[c - 'a']++;
        }
    }

    fclose(file);

    printf("\n\nZeichenfrequenzanalyse:\n");
    for (int i = 0; i < ALPHABET_SIZE; i++)
    {
        printf("%c: %d\n", i + 'a', frequency[i]);
    }
}

int main()
{
    const char *filename = "output.txt";
    readFileAndCountFrequency(filename);
    return 0;
}
