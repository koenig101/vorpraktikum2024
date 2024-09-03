#include <stdio.h>

int main(void)
{
    int u, v, temp;

    printf("Gib zwei nicht - negative ganze Zahlen ein: \n");
    scanf("%d%d", &u, &v);

    while (v != 0)
    {
        temp = u % v;
        u = v;
        v = temp;
    }

    printf("Der groesste gemeinsame Teiler ist %d\n", u);
    return 0;
}