#include <stdio.h>

int globalVar = 0;

void incrementGlobal()
{
    globalVar++;
    printf("Globale Variable: %d\n", globalVar);
}

void localVariableDemo()
{
    int localVar = 0;
    localVar++;
    printf("Lokale Variable: %d\n", localVar);
}

void staticVariableDemo()
{
    static int staticVar = 0;
    staticVar++;
    printf("Statische Variable: %d\n", staticVar);
}

int main(void)
{
    incrementGlobal();
    incrementGlobal();

    localVariableDemo();
    localVariableDemo();

    staticVariableDemo();
    staticVariableDemo();

    return 0;
}