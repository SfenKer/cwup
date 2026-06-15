import static java.lang.IO.println;
import static java.lang.IO.readln;
import static java.lang.Integer.parseInt;

int przestaw(int n) {

    int r = n % 100;
    int a = r / 10;
    int b = r % 10;
    n /= 100;

    final int w;
    if (n > 0) {
        w = a + 10 * b + 100 * przestaw(n);
    } else {
        if (a > 0) {
            w = a + 10 * b;
        } else {
            w = b;
        }
    }

    return w;
}

void main() {
    final var num = parseInt(readln("Number: "));
    println("Result: " + przestaw(num));
}
