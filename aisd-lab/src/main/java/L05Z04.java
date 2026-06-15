import static java.lang.IO.println;
import static java.lang.IO.readln;
import static java.lang.Integer.parseInt;

int przestaw(int n) {

    if (n == 0) {
        return 0;
    }

    int rs = 0,
        mt = 1;

    while (n > 0) {

        int r = n % 100;
        int a = r / 10;
        int b = r % 10;
        n /= 100;

        int w;
        if (n > 0) {
            w = a + 10 * b;
        } else {
            if (a > 0) {
                w = a + 10 * b;
            } else {
                w = b;
            }
        }

        rs += (w * mt);
        mt *= 100;
    }

    return rs;
}

void main() {
    final var num = parseInt(readln("Number: "));
    println("Result: " + przestaw(num));
}
