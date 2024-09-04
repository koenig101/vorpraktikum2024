#include <stdio.h>

int summeArray(int arr[], int groesse)
{
    int summe = 0;
    for (int i = 0; i < groesse; ++i)
    {
        summe += arr[i];
    }
    return summe;
}

int maxArray(int arr[], int groesse)
{
    int max = arr[0];
    for (int i = 1; i < groesse; ++i)
    {
        if (arr[i] > max)
        {
            max = arr[i];
        }
    }
    return max;
}

int main(void)
{
    int zahlen[] = {5, 8, 12, 3, 7};
    int groesse = 5;

    printf("Summe der Elemente: %d\n", summeArray(zahlen, groesse));
    printf("Maximales Element: %d\n", maxArray(zahlen, groesse));

    return 0;
}