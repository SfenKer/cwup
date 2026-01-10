#include <stdio.h>
#include <stdlib.h>

int main() {

    system("chcp 65001 >nul");

    int points;
    printf("Podaj liczbę punktów: ");
    scanf("%d", &points);

    printf("Ocena: ");
    if (points > 90)
        printf("5.0");

    else if (points > 80)
        printf("4.5");

    else if (points > 70)
        printf("4.0");

    else if (points > 60)
        printf("3.5");

    else if (points >= 50)
        printf("3.0");

    else
        printf("2.0");
    printf("\n");


}
