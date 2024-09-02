#include <stdio.h>

int main(void)
{
    float num;

    printf("Gib eine Fliesskommazahl ein: ");
    scanf("%f", &num);

    printf("Normale Darstellung: %f\n", num);
    printf("Wissenschaftliche Notation: %e\n", num);

    return 0;
}
