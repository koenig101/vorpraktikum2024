#include <stdio.h>

void anhaengenDatei()
{
    FILE *fp = fopen("output.txt", "a");
    if (fp == NULL)
    {
        printf("Fehler beim Oeffnen der Datei!\n");
        return;
    }

    fprintf(fp, "Eine weitere Zeile wird angehaengt.\n");
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

    printf("1. Inhalt loeschen und neu schreiben\n");
    printf("2. Inhalt anhaengen\n");
    printf("Waehle eine Option: ");
    scanf("%d", &wahl);

    if (wahl == 1)
    {
        FILE *fp = fopen("output.txt", "w");
        if (fp == NULL)
        {
            printf("Fehler beim Oeffnen der Datei!\n");
            return 1;
        }

        fprintf(fp, "Dies ist die erste Zeile.\n");
        fclose(fp);
    }
    else if (wahl == 2)
    {
        anhaengenDatei();
    }
    else
    {
        printf("Ungueltige Wahl!\n");
    }

    leseDatei();

    return 0;
}