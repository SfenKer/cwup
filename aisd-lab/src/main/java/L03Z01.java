import static java.lang.IO.println;
import static java.lang.IO.readln;
import static java.lang.Integer.parseInt;

void main() {

    final var string$n = readln("Provide N: ");
    final int n = parseInt(string$n);
    var k = 3;

    while (k < n) {

        var l = 2;
        var z = 0;

        while (l <= (k / 2)) {
            if (k % l != 0) {
                l++;
            } else {
                z = 1;
                break;
            }
        }

        if (z == 0) {
            println(k);
        }

        k++;

    }

}