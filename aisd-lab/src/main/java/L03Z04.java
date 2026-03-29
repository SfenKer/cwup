import static java.lang.IO.println;
import static java.lang.IO.readln;
import static java.lang.Integer.parseInt;
import static java.lang.Math.PI;

void main() {

    final var itNum = parseInt(readln("Iterations: "));

    var r = 1d;
    for (var n = 1; n <= itNum; n++) {
        final var a = 4d * n * n;
        r *= a / (a - 1d);
    }

    final var pi = r * 2d;

    println("Calculated PI: " + pi);
    println("Hardcoded PI: " + PI);

}