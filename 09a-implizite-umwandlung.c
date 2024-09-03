#include <stdio.h>

int main(void)
{
    float fValue;
    int iValue;

    printf("Gib eine Fliesskommazahl ein: ");
    scanf("%f", &fValue);

    iValue = (int)fValue;
    printf("Vor der Umwandlung: %f\n", fValue);
    printf("Nach der Umwandlung: %d\n", iValue);

    return 0;
}
