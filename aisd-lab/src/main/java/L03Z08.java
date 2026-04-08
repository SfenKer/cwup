import static java.lang.IO.println;

void main() {

    println("Perfect numbers in range <1, 1000>:");

    for (var n = 1; n <= 1000; n++) {

        var sum = 0;
        for (var i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }

        if (sum == n && n > 0) {
            println(n);
        }

    }

}