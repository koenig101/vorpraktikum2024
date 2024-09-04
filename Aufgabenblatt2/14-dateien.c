#include <stdio.h>

void schreibeDatei()
{
    FILE *fp = fopen("output.txt", "w");
    if (fp == NULL)
    {
        printf("Fehler beim Oeffnen der Datei!\n");
        return;
    }

    fprintf(fp, "Dies ist die erste Zeile.\n");
    fprintf(fp, "Dies ist die zweite Zeile.\n");
    fprintf(fp, "Dies ist die dritte Zeile.\n");

    fclose(fp);
}

void leseDatei()
{
    FILE *fp = fopen("output.txt", "r");
    char buffer[100];

    if (fp == NULL)
    {
        printf("Fehler beim Oeffnen der Datei!\n");
        return;
    }

    while (fgets(buffer, 100, fp) != NULL)
    {
        printf("%s", buffer);
    }

    fclose(fp);
}

int main(void)
{
    int wahl;

    printf("1. Schreibe in die Datei\n");
    printf("2. Lese aus der Datei\n");
    printf("Waehle eine Option: ");
    scanf("%d", &wahl);

    if (wahl == 1)
    {
        schreibeDatei();
    }
    else if (wahl == 2)
    {
        leseDatei();
    }
    else
    {
        printf("Ungueltige Wahl!\n");
    }

    return 0;
}