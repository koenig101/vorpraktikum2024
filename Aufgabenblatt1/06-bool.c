#include <stdio.h>
#include <stdbool.h>

int main(void)
{
    int num;
    bool is_even;

    printf("Gib eine ganze Zahl ein: ");
    scanf("%d", &num);

    is_even = (num % 2 == 0);

    if (is_even)
    {
        printf("Die Zahl ist gerade: true\n");
    }
    else
    {
        printf("Die Zahl ist ungerade: false\n");
    }

    return 0;
}
