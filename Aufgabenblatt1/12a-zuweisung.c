#include <stdio.h>

int main(void)
{
    int iValue;

    printf("Gib eine Ganzzahl ein: ");
    scanf("%d", &iValue);

    iValue += 10;
    printf(" Neuer Wert : %d\n", iValue);

    return 0;
}