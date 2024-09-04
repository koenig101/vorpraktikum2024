#include <stdio.h>

int ggt(int a, int b)
{
    while (b != 0)
    {
        int temp = b;
        b = a % b;
        a = temp;
    }
    return a;
}

int main(void)
{
    int zahl1, zahl2;
    char choice;

    do
    {
        printf("Gib die erste Zahl ein: ");
        scanf("%d", &zahl1);
        printf("Gib die zweite Zahl ein: ");
        scanf("%d", &zahl2);

        printf("Der GGT von %d und %d ist %d\n", zahl1, zahl2, ggt(zahl1, zahl2));

        printf("Möchten Sie eine weitere Berechnung durchführen? (j/n): ");
        scanf(" %c", &choice);
    } while (choice == 'j' || choice == 'J');

    return 0;
}