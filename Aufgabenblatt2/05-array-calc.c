#include <stdio.h>

int main(void)
{
    int zahlen[5];
    int summe = 0;
    for (int i = 0; i < 5; ++i)
    {
        printf("Gib eine Zahl ein: ");
        scanf("%d", &zahlen[i]);
        summe += zahlen[i];
    }
    float durchschnitt = (float)summe / 5;
    printf("Der Durchschnitt ist %.2f\n", durchschnitt);
    return 0;
}