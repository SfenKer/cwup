import static java.lang.IO.println;

boolean isPrimeNumber(
    final int number
) {

    if (number < 2) {
        return false;
    }

    for (var i = 2; i * i <= number; i++) {
        if (number % i == 0) {
            return false;
        }
    }

    return true;

}

void main() {

    final var limit = 1000;

    println("Pairs of twins in range <1, 1000>:");

    var l = -1;
    for (var i = 2; i <= limit; i++) {
        if (isPrimeNumber(i)) {
            if (l != -1 && (i - l == 2)) {
                println("(%d, %d)".formatted(l, i));
            }
            l = i;
        }
    }

}