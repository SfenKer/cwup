import static java.lang.IO.println;

int skroc(int x) {
    return x / 10;
}

int dopisz(int x) {
    return x * 10;
}

int ostatnia(int x) {
    return x % 10;
}

int f(int a, int b) {

    if (b == 0) {
        return 0;
    }

    int k = ostatnia(b);
    int w = f(a, skroc(b));
    w = dopisz(w);

    while (k > 0) {
        w += a;
        k--;
    }

    return w;

}

void main() {

    final int a = 15,
              b = 4;

    println("f(" + a + ", " + b + ") = " + f(a, b));
    println("Expected: " + (a * b));

    println("Helper Functions Tests:");
    println("skroc(249) = " + skroc(249));
    println("dopisz(29) = " + dopisz(29));
    println("ostatnia(307) = " + ostatnia(307));

}
