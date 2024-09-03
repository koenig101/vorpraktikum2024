#include <stdio.h>

int main(void)
{
    char name[50];
    printf("Wie heisst du? ");
    scanf("%s", name);
    printf("Hallo , %s! Willkommen zum C- Programmieren .\n",
           name);
    return 0;
}