#include <stdio.h>

int main(void)
{
    int iValue;
    float result;

    printf("Gib eine Ganzzahl ein: ");
    scanf("%d", &iValue);

    result = (float)iValue / 2;
    printf("Ergebnis der Division: %f\n", result);

    return 0;
}
