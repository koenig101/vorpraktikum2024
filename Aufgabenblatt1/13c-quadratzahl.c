#include <stdio.h>

int main(void)
{
    // Zuerst die Zahlen von 1 bis 4 ausgeben
    for (int i = 1; i <= 10; ++i)
    {
        printf("%-5d", i); // %-5d sorgt für einen Abstand von 5 Zeichen
    }
    printf("\n");

    // Dann die Quadrate der Zahlen von 1 bis 4 ausgeben
    for (int i = 1; i <= 10; ++i)
    {
        printf("%-5d", i * i); // %-5d sorgt für einen Abstand von 5 Zeichen
    }
    printf("\n");

    return 0;
}
