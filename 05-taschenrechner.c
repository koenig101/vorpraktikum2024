#include <stdio.h>

int main(void)
{
    float num1, num2;

    printf("Gib die erste Zahl ein: ");
    scanf("%f", &num1);

    printf("Gib die zweite Zahl ein: ");
    scanf("%f", &num2);

    printf("Summe: %f\n", num1 + num2);
    printf("Differenz: %f\n", num1 - num2);
    printf("Produkt: %f\n", num1 * num2);

    if (num2 != 0)
    {
        printf("Quotient: %f\n", num1 / num2);
    }
    else
    {
        printf("Division durch 0 ist nicht möglich.\n");
    }

    // Modulo-Operation nur bei Ganzzahlen sinnvoll
    int int_num1 = (int)num1;
    int int_num2 = (int)num2;

    if (int_num2 != 0)
    {
        printf("Modulo: %d\n", int_num1 % int_num2);
    }

    return 0;
}
