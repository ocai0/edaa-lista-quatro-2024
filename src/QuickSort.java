
class QuickSort {
    public static <T extends Comparable<T>> void sort(T[] list, int startIndex, int endIndex) {
        if (startIndex < endIndex) {
            int pivotIndex = QuickSort.partition(list, startIndex, endIndex);
            QuickSort.sort(list, startIndex, pivotIndex - 1);
            QuickSort.sort(list, pivotIndex + 1, endIndex);
        }
    }

    private static <T extends Comparable<T>> int partition(T[] list, int startIndex, int endIndex) {
        T pivotValue = list[endIndex];
        int i = startIndex;
        for (int j = startIndex; j < endIndex; j++) {
            int compareResult = list[j].compareTo(pivotValue);
            if (compareResult != 1) {
                T aux = list[j];
                list[j] = list[i];
                list[i] = aux;
                i += 1;
            }
        }
        T aux = list[i];
        list[i] = list[endIndex];
        list[endIndex] = aux;

        return i;
    }
}