import static java.lang.Double.parseDouble;
import static java.lang.IO.println;
import static java.lang.IO.readln;
import static java.lang.Integer.parseInt;

void main() {

    final var n = parseInt(readln("Provide polynomial degree (n): "));
    final var x = parseDouble(readln("Provide argument value (x): "));

    final double[] a = new double[n + 1];

    var i = 0;
    while (i <= n) {
        a[i] = parseDouble(readln("Provide a[%d]: ".formatted(i)));
        i = i + 1;
    }

    i = n - 1;

    var y = a[n];
    while (i >= 0) {
        y = y * x + a[i];
        i = i - 1;
    }

    println("Polynomial Value: %s".formatted(y));

}