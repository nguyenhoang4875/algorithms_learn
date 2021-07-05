package Quick_Sort;

import java.util.Random;

/**
 * references: https://www.geeksforgeeks.org/quick-sort/,
 * baeldung.com/java-quicksort
 */
public class QuickSort {
    public static void main(String[] args) {
        int n = 100;
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(n);
        }

        printArray(a);
        long begin = System.currentTimeMillis();
        System.out.println("Before sort: " + begin);
        quickSort(a, 0, n-1);

        System.out.println("*****************************");
        quickSort(a, 0, n-1);
        long end = System.currentTimeMillis();
        System.out.println("After sort: " + end);
        printArray(a);
        System.out.println("QuickSort time duration: " + (end - begin));

    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            //int pi = partition(arr, low, high);
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int pi = arr[high];
        int i = low ;
        for (int j = low; j <= high -1; j++) {
            if (arr[j] < pi) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i++;
            }
        }
        int temp = arr[i];
        arr[i] = arr[high];
        arr[high] = temp;

        return i;
    }

/*     private static int partition2(int[] arr, int low, int high) {
        int pi = arr[low];
        int i = high;
        for (int j = high; j >= low +1; j--) {
            if (arr[j] > pi) {
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
                i--;
            }
        }
        int temp = arr[i];
        arr[i] = arr[low];
        arr[low] = temp;

        return i;
    }
 */
    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }
}