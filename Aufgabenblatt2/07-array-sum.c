#include <stdio.h>
int main(void)
{
    int zahlen[8];
    int summe = 0;
    // Zahlen einlesen und summieren
    for (int i = 0; i < 8; ++i)
    {
        printf("Gib eine Zahl ein: ");
        scanf("%d", &zahlen[i]);
        summe += zahlen[i];
    }
    printf("Die Summe der Zahlen ist %d\n", summe);
    return 0;
}