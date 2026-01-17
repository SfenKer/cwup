#include <time.h>
#include <stdio.h>
#include <stdlib.h>

#define TARGET_GOLD 2137

typedef struct {
    int health;
    int gold;
    int killedBy;
} player;

const char* enemies[] = {
    "Goblin",
    "Troll",
    "Smok"
};

void action(
    player* player
) {

    const int rng = rand() % 100;

    if (rng < 50) {

        const int idx = rand() % 3,
                  dmg = (rand() % 20) + 5;

        printf("[!] Wróg: %s!\n", enemies[idx]);
        printf("[!] Wróg zadał tobie %d obrażeń.\n", dmg);

        player->health -= dmg;
        if (player->health <= 0)
            player->killedBy = idx;

    } else {

        const int gold = (rand() % 300) + 50;
        printf("[!] Znalazłeś skrzynie skarbów!\n");
        printf("[!] Otrzymałeś %dg złota.\n", gold);

        player->gold += gold;

    }

}

int main() {

#ifdef _WIN32
    system("chcp 65001 > nul");
#endif

    srand(time(NULL));

    int32_t rdb;
    player player;

    player.health = 100;
    player.gold = 0;

    printf("Sterowanie:\n");
    printf("1. Eksploracja\n");
    printf("2. Sprawdzenie zdrowia i sztabek złota.\n\n");

    do {

        fflush(stdin);
        printf("Akcja: ");
        scanf("%d", &rdb);

        switch (rdb) {

            case 1: {
                action(&player);
                break;
            }

            case 2: {
                printf("[STAN] Zdrowie: %d ❤️ | Złoto: %dg\n", player.health, player.gold);
                break;
            }

            default: {
                printf("No chyba nie? Poprawne sterowanie:\n");
                printf("1. Eksploracja\n");
                printf("2. Sprawdzenie zdrowia i sztabek złota.\n");
                break;
            }

        }

    } while (player.health > 0 && player.gold < TARGET_GOLD);

    if (player.health <= 0) {
        printf("ZGON! Zostałeś zabity przez %s\n", enemies[player.killedBy]);
        printf("[...] Nikt ci nie dokopie jak samo życie, wali mocno. [...]");
    } else {
        printf("GRATULACJE! Uzbierałeś %dg złota!\n", player.gold);
        printf("Pamiętaj o odprowadzeniu podatku, skarbówka w drodze!");
    }

    return 0;

}