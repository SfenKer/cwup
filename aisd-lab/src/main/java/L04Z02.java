import static java.lang.IO.println;
import static java.util.Arrays.copyOf;
import static java.util.concurrent.ThreadLocalRandom.current;
import static java.util.stream.IntStream.range;

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