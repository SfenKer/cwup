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

    boolean swap;
    int n = array.length;

    for (int i = 0; i < n - 1; i++) {

        swap = false;
        for (int j = 0; j < n - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                final var temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
                swap = true;
            }
        }

        if (!swap) {
            break;
        }

    }

    println("Original: " + Arrays.toString(origin));
    println("Sorted: " + Arrays.toString(array));

}