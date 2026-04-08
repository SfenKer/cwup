import static java.lang.IO.println;
import static java.lang.IO.readln;
import static java.lang.Integer.parseInt;
import static java.lang.Math.abs;

void main() {

    final var number = parseInt(readln("Provide Number: "));

    var temp = abs(number);
    var binary = "";

    while (temp > 0) {
        var r = temp % 2;
        binary = r + binary;
        temp /= 2;
    }

    /* // Nie było nic o tym żeby dodawać znak, ale wrazie w zrobilem.
    if (number < 0) {
        binary = "-" + binary;
    }
     */

    println("Decimal: " + number);
    println("Binary: " + binary);

}