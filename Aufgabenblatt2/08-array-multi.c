#include <stdio.h>

int main(void)
{
    int tabelle[10][10];

    // Tabelle füllen
    for (int i = 0; i < 10; ++i)
    {
        for (int j = 0; j < 10; ++j)
        {
            tabelle[i][j] = (i + 1) * (j + 1);
        }
    }

    // Tabelle ausgeben
    printf("Multiplikationstabelle:\n");
    for (int i = 0; i < 10; ++i)
    {
        for (int j = 0; j < 10; ++j)
        {
            printf("%4d", tabelle[i][j]);
        }
        printf("\n");
    }

    return 0;
}