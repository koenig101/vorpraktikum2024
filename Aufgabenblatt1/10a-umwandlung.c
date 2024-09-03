#include <stdio.h>

int main(void)
{
    int num1, num2, result;

    printf("Gib die erste Ganzzahl ein: ");
    scanf("%d", &num1);
    printf("Gib die zweite Ganzzahl ein: ");
    scanf("%d", &num2);

    result = num1 / num2;
    printf("Ergebnis der Division: %d\n", result);

    return 0;
}
