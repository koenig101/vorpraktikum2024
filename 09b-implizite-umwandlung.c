#include <stdio.h>

int main(void)
{
    int iValue;
    float fValue;

    printf("Gib eine Ganzzahl ein: ");
    scanf("%d", &iValue);

    fValue = (float)iValue;
    printf("Vor der Umwandlung: %d\n", iValue);
    printf("Nach der Umwandlung: %f\n", fValue);

    return 0;
}
