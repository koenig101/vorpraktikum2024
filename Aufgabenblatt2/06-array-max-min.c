#include <stdio.h>

int main(void)
{
    int zahlen[10];
    int max, min;

    // Zahlen einlesen
    for (int i = 0; i < 10; ++i)
    {
        printf("Gib eine Zahl ein: ");
        scanf("%d", &zahlen[i]);
    }

    // Initialisiere max und min mit dem ersten Element
    max = min = zahlen[0];

    // Hoechster und niedrigster Wert finden
    for (int i = 1; i < 10; ++i)
    {
        if (zahlen[i] > max)
        {
            max = zahlen[i];
        }
        if (zahlen[i] < min)
        {
            min = zahlen[i];
        }
    }

    printf("Der hoechste Wert ist %d\n", max);
    printf("Der niedrigste Wert ist %d\n", min);

    return 0;
}