import static java.lang.IO.println;
import static java.util.Arrays.copyOf;
import static java.util.concurrent.ThreadLocalRandom.current;
import static java.util.stream.IntStream.range;

/*
 * Quick Sort Algorithm
 * - O(n²) - gdy pivot zawsze trafia na element najmniejszy lub największy
 * - O(n log n) - statystycznie najczęstszy i bardzo wydajny dla dużych zbiorów
 * - O(n log n) - gdy pivot idealnie dzieli tablicę na równe części
 * - O(log n) - złożoność pamięciowa wynikająca z głębokości stosu wywołań rekurencyjnych
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

    quickSort(array, 0, array.length - 1);

    println("Original: " + Arrays.toString(origin));
    println("Sorted: " + Arrays.toString(array));

}

void quickSort(
    int[] arr,
    int low,
    int high
) {

    if (low >= high) {
        return;
    }

    int i = low - 1;
    final int pivot = arr[high];

    for (int j = low; j < high; j++) {
        if (arr[j] <= pivot) {
            i++;
            final int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
    }

    final int partitionIndex = i + 1;
    final int temp = arr[partitionIndex];

    arr[partitionIndex] = arr[high];
    arr[high] = temp;

    quickSort(arr, low, partitionIndex - 1);
    quickSort(arr, partitionIndex + 1, high);

}

