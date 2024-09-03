#include <stdio.h>

int main(void)
{
    int iValue;
    float fValue, result;

    printf("Gib eine Ganzzahl ein: ");
    scanf("%d", &iValue);
    printf("Gib eine Fliesskommazahl ein: ");
    scanf("%f", &fValue);

    result = iValue / fValue;
    printf("Ergebnis der Division: %f\n", result);

    return 0;
}
