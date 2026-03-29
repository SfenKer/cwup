import static java.lang.IO.println;
import static java.lang.IO.readln;
import static java.lang.Integer.parseInt;

void main() {

    final var number = parseInt(readln("Provide Number: "));

    var r = 0;
    var temp = number;

    while (temp != 0) {
        r = r * 10 + (temp % 10);
        temp /= 10;
    }

    println("Origin: " + number);
    println("Reversed: " + r);

}