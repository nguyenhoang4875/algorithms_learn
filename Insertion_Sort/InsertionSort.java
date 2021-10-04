package Insertion_Sort;

public class InsertionSort {

    public static void insertionSort(int[] arr, int n) {
        for (int i = 1; i < n; i++) {
            int keyValue = arr[i];
            int indexOfSortedArr = i - 1;

            while (indexOfSortedArr >= 0 && arr[indexOfSortedArr] > keyValue) {
                arr[indexOfSortedArr + 1] = arr[indexOfSortedArr];
                indexOfSortedArr--;
            }

            arr[indexOfSortedArr + 1] = keyValue;
        }
    }

}
