#include <stdio.h>

int main(void)
{
    int num1, num2, num3;
    printf("Gib die erste Zahl ein: ");
    scanf("%d", &num1);
    printf("Gib die zweite Zahl ein : ");
    scanf("%d", &num2);
    printf("Gib die dritte Zahl ein : ");
    scanf("%d", &num3);

    printf("\nZahlen in tabellarischer Form :\n");
    printf("%-10s %-10s %-10s\n", "Zahl 1", "Zahl 2", "Zahl 3");
    printf("%-10d %-10d %-10d\n", num1, num2, num3);
    return 0;
}