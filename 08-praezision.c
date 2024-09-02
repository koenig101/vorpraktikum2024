#include <stdio.h>

int main(void)
{
    float fValue = 123456789.123456789f;
    double dValue = 123456789.123456789;

    printf("float: %.10f\n", fValue);
    printf("double: %.10f\n", dValue);

    return 0;
}
