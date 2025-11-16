#include <stdio.h>
#include <stdlib.h>

int main() {

    system("chcp 65001 >nul");

    int celcius, rainState;
    printf("Podaj temperature: ");
    scanf("%d", &celcius);

    printf("Czy pada (0 - nie, 1 - tak): ");
    scanf("%d", &rainState);

    if ((celcius > 25 && rainState == 0) || (celcius > 35))
        printf("Można iść na basen.\n");
    else
        printf("Lepiej zostać w domu.\n");

}