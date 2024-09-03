#include <stdio.h>

int main(void)
{
    int num1, num2;

    printf("Gib die erste Ganzzahl ein : ");
    scanf("%d", &num1);
    printf("Gib die zweite Ganzzahl ein: ");
    scanf("%d", &num2);
    num1 /= num2;
    printf(" Ergebnis der Division : %d\n", num1);

    return 0;
}