#include <stdio.h>
int main(void)
{
    int zahlen[10] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    for (int i = 9; i >= 0; --i)
    {
        printf("%d\n", zahlen[i]);
    }
    return 0;
}