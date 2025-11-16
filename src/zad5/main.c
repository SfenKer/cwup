#include <stdio.h>
#include <stdlib.h>

int main() {

    system("chcp 65001 >nul");

    int selectionOne, selectionTwo;

    printf("Budzisz się w ciemnym lochu. Przed Tobą (1) ciężkie dębowe drzwi i (2) wąski tunel. Co wybierasz? (wpisz 1 lub 2): ");
    scanf("%d", &selectionOne);

    switch (selectionOne) {

        case 1: {
            printf("Drzwi prowadzą do sali tronowej. Na tronie siedzi król. (1) Skłaniasz się nisko, (2) Ignorujesz go i idziesz dalej.: ");
            scanf("%d", &selectionTwo);
            if (selectionTwo == 1)
                printf("Król jest pod wrażeniem Twoich manier. Mianuje Cię swoim doradcą. Wygrałeś!");
            else
                printf("Za obrazę majestatu strażnicy wtrącają Cię z powrotem do lochu. Koniec gry.");
            break;
        }

        case 2: {
            printf("Czołgasz się przez tunel i docierasz do skarbca pilnowanego przez śpiącego smoka. (1) Próbujesz się przekraść po złoto, (2) Wycofujesz się po cichu.: ");
            scanf("%d", &selectionTwo);
            if (selectionTwo == 1)
                printf("Smok obudził się i zionął ogniem. Przegrałeś.");
            else
                printf("Udało Ci się bezpiecznie wrócić do lochu. Zawsze to jakieś wyjście... Koniec gry.");
            break;
        }

        default: {
            printf("Z niezdecydowania potykasz się i wpadasz w ukrytą zapadnię. Koniec gry.");
            break;
        }

    }

    printf("\n");

}