#include <stdio.h>

int main(void)
{
    int num1, num2;
    printf("Gib die erste Zahl ein: ");
    scanf("%d", &num1);
    printf("Gib die zweite Zahl ein: ");
    scanf("%d", &num2);

    printf("Summe: %d\n", num1 + num2);
    printf("Differenz: %d\n", num1 - num2);
    printf("Produkt: %d\n", num1 * num2);
    printf("Quotient: %d\n", num1 / num2);
}