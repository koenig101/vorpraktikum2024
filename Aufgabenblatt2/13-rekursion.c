#include <stdio.h>

int fakultaet(int n)
{
    if (n == 0)
    {
        return 1;
    }
    else
    {
        return n * fakultaet(n - 1);
    }
}

int summeErsteN(int n)
{
    if (n == 1)
    {
        return 1;
    }
    else
    {
        return n + summeErsteN(n - 1);
    }
}

int main(void)
{
    int zahl;

    printf("Gib eine Zahl ein: ");
    scanf("%d", &zahl);

    printf("Die Fakultaet von %d ist %d\n", zahl, fakultaet(zahl));
    printf("Die Summe der ersten %d Zahlen ist %d\n", zahl, summeErsteN(zahl));

    return 0;
}