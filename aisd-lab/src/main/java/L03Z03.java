import static java.lang.IO.println;
import static java.lang.IO.readln;
import static java.lang.Integer.parseInt;
import static java.lang.Math.PI;
import static java.lang.Math.pow;

void main() {

    final var itNum = parseInt(readln("Iterations: "));

    var sum = 0d;
    for (var i = 0; i < itNum; i++) {
        sum += pow(-1, i) / (2d * i + 1d);
    }

    final var pi = sum * 4d;
    println("Calculated PI: " + pi);
    println("Hardcoded PI: " + PI);

}