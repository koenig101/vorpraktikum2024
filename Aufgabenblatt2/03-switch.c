#include <stdio.h>

int main(void)
{
    int tag;
    printf("Gib eine Zahl zwischen 1 und 7 ein: ");
    scanf("%d", &tag);

    switch (tag)
    {
    case 1:
        printf("Montag\n");
        break;
    case 2:
        printf("Dienstag\n");
        break;
    case 3:
        printf("Mittwoch\n");
        break;
    case 4:
        printf("Donnerstag\n");
        break;
    case 5:
        printf("Freitag\n");
        break;
    case 6:
        printf("Samstag - Wochenende!\n");
        break;
    case 7:
        printf("Sonntag - Wochenende!\n");
        break;
    default:
        printf("Ungueltige Eingabe! Bitte eine Zahl zwischen 1 und 7 eingeben.\n");
    }

    return 0;
}