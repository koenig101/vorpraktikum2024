#include <stdio.h>

int main(void)
{
    int number, right_digit;

    printf("Gib eine Zahl ein .\n");
    scanf("%d", &number);

    do
    {
        right_digit = number % 10;
        printf("%d", right_digit);
        number = number / 10;
    } while (number != 0);

    printf("\n");
    return 0;
}