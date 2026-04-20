import static java.lang.IO.println;
import static java.util.Arrays.copyOf;
import static java.util.concurrent.ThreadLocalRandom.current;
import static java.util.stream.IntStream.range;

/*
 * Insertion Sort Algorithm
 * - O(n²) - występuje, gdy tablica jest posortowana odwrotnie
 * - O(n²) - statystycznie dla losowych danych algorytm wykonuje n²/4 porównań i zamian
 * - O(n) - w przypadku gdy dane są już posortowane
 */
void main() {

    final var size = 50;

    int[] array = range(0, size)
            .map(
                (_) ->
                    current()
                        .nextInt()
            )
            .toArray();
    final int[] origin = copyOf(array, array.length);

    int n = array.length;
    for (int i = 1; i < n; i++) {

        int j = i - 1;
        final int key = array[i];

        while (j >= 0 && array[j] > key) {
            array[j + 1] = array[j];
            j -= 1;
        }

        array[j + 1] = key;

    }

    println("Original: " + Arrays.toString(origin));
    println("Sorted: " + Arrays.toString(array));

}