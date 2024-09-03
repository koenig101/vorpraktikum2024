#include <stdio.h>

int main(void)
{
    float fValue1, fValue2;
    int result;

    printf("Gib die erste Fliesskommazahl ein: ");
    scanf("%f", &fValue1);
    printf("Gib die zweite Fliesskommazahl ein: ");
    scanf("%f", &fValue2);

    result = (int)fValue1 + (int)fValue2;
    printf("Ergebnis der Addition: %d\n", result);

    return 0;
}
