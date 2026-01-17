#include <math.h>
#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>

int main() {

#ifdef _WIN32
    system("chcp 65001 > nul");
#endif

    int32_t rdb;
    double_t avg = 0;
    int32_t* values = NULL;
    size_t size = 0, negNonPairs = 0;

    printf("Podawaj liczby w przedziale od -50 do 50, podając 0 zostaną wyświetlone statystyki.\n\n");

    do {

        fflush(stdin);
        printf("Wartość: ");
        scanf("%d", &rdb);

        if (rdb < -50 || rdb > 50) {
            printf("Błąd! Podaj wartość w przedziale od -50 do 50.\n");
            continue;
        }

        if (rdb == 0)
            break;

        if (rdb % 2 != 0 && rdb < 0)
            negNonPairs++;

        size++;
        values = (int32_t*) realloc(values, size * sizeof(int32_t));
        values[size - 1] = rdb;

        avg = 0;
        size_t nonNegNums = 0;
        for (size_t i = 0; i < size; i++)
            if (values[i] > 0) {
                nonNegNums++;
                avg += values[i];
            }

        if (nonNegNums != 0)
            avg /= nonNegNums;

    } while (rdb != 0);

    for (int i = 0; i < size; i++)
        printf("*");
    printf("\n");

    printf("Średnia arytmetyczna liczb: %f\n", avg);
    printf("Ilość liczb ujemnych nieparzystych: %lu", negNonPairs);

    return 0;

}