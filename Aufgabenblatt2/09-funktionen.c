#include <stdio.h>

int quadrat(int x)
{
    return x * x;
}

int kubik(int x)
{
    return x * x * x;
}

int main(void)
{
    int zahl;
    printf("Gib eine Zahl ein: ");
    scanf("%d", &zahl);

    printf("Das Quadrat von %d ist %d\n", zahl, quadrat(zahl));
    printf("Das Kubik von %d ist %d\n", zahl, kubik(zahl));

    return 0;
}