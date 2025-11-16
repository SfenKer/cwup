#include <stdio.h>
#include <math.h>
#include <stdlib.h>

int main() {

    system("chcp 65001 >nul");

    char operand;
    double a, result;

    printf("Podaj liczbę: ");
    scanf("%lf", &a);

    printf("Wybierz operacje (s, q, i): ");
    scanf(" %c", &operand);

    switch (operand) {

        case 's': {
            if (a < 0) {
                printf("Błąd: Nie można obliczyć pierwiastka z liczby ujemnej.");
                return 0;
            }
            result = sqrt(a);
            break;
        }

        case 'q': {
            result = pow(a, 2);
            break;
        }

        case 'i': {
            if (a == 0) {
                printf("Błąd: dzielenie przez zero");
                return 0;
            }
            result = 1 / a;
            break;
        }

        default: {
            printf("Błąd: nieznana operacja");
            return 0;
        }

    }

    printf("Wynik: %f", result);

}