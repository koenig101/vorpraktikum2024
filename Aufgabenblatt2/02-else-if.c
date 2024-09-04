#include <stdio.h>
int main(void)
{
    int alter;
    printf("Gib dein Alter ein: ");
    scanf("%d", &alter);
    if (alter < 13)
    {
        printf(" Kind \n");
    }
    else if (alter >= 13 && alter <= 19)
    {
        printf(" Teenager \n");
    }
    else
    {
        printf(" Erwachsener \n");
    }
    return 0;
}