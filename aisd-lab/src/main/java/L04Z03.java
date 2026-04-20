import static java.lang.IO.println;
import static java.util.Arrays.copyOf;
import static java.util.Arrays.copyOfRange;
import static java.util.concurrent.ThreadLocalRandom.current;
import static java.util.stream.IntStream.range;

/*
 * Merge Sort Algorithm
 * - O(n log n) - zawsze dzieli tablicę na pół i scala n elementów
 * - O(n log n) - stabilna wydajność niezależnie od rozkładu danych
 * - O(n log n) - algorytm zawsze wykonuje pełny podział i scalanie
 * - O(n) - dodatkowa złożoność pamięciowa wymagana na tablice pomocnicze
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

    mergeSort(array, 0, array.length - 1);

    println("Original: " + Arrays.toString(origin));
    println("Sorted: " + Arrays.toString(array));

}

void mergeSort(
    int[] arr,
    int left,
    int right
) {

    if (left >= right) {
        return;
    }

    final int mid = left + (right - left) / 2;

    mergeSort(arr, left, mid);
    mergeSort(arr, mid + 1, right);

    final int[] leftArray = copyOfRange(arr, left, mid + 1);
    final int[] rightArray = copyOfRange(arr, mid + 1, right + 1);

    int i = 0, j = 0, k = left;
    while (i < leftArray.length && j < rightArray.length) {
        arr[k++] = (leftArray[i] <= rightArray[j]) ?
            leftArray[i++] : rightArray[j++];
    }

    while (i < leftArray.length) {
        arr[k++] = leftArray[i++];
    }

    while (j < rightArray.length) {
        arr[k++] = rightArray[j++];
    }

}
