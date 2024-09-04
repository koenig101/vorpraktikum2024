#include <stdio.h>

int main(void)
{
    int zahl;
    printf("Gib eine Zahl ein: ");
    scanf("%d", &zahl);

    if (zahl > 0)
    {
        printf("Die Zahl ist positiv .\n");
    }
    else if (zahl < 0)
    {
        printf("Die Zahl ist negativ .\n");
    }
    else
    {
        printf("Die Zahl ist null .\n");
    }

    return 0;
}