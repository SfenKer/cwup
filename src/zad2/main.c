#include <stdio.h>
#include <stdlib.h>

int main() {

    system("chcp 65001 >nul");

    int number;
    printf("Podaj liczbę: ");
    scanf("%d", &number);

    printf("Liczba %d %s liczbą parzystą.", number, (number % 2 == 0) ? "jest" : "nie jest");


}