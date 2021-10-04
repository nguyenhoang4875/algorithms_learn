package Selection_Sort;

public class SelectionSort {

    public static void selectionSort(int[] arr, int n) {
        for (int i = 0; i < n -1; i++) {
            int iMin = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[iMin] > arr[j]) {
                    iMin = j;
                }
            }

            if (iMin != i) {
                int temp = arr[i];
                arr[i] = arr[iMin];
                arr[iMin] = temp;
            }
        }
    }

}
