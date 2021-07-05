package Merge_Sort;

import java.util.Random;

public class MergeSort {
    public static void main(String[] args) {
        int n = 100000;
        int[] a = new int[n];
        Random random = new Random();
        for (int i = 0; i < a.length; i++) {
            a[i] = random.nextInt(n);
        }
        int[] b = a.clone();

        long begin = System.currentTimeMillis();
        System.out.println("Before sort: " + begin);
        mergeSort(a, a.length);
        long end = System.currentTimeMillis();
        System.out.println("After sort: " + end);
        printArray(a);
        System.out.println("MergeSort time duration: " + (end - begin));

        begin = System.currentTimeMillis();
        bubbleSort(b, n);
        end = System.currentTimeMillis();
        System.out.println("BubbleSort time duration: " + (end - begin));
    }

    public static void mergeSort(int[] a, int n) {
        if (n == 1) {
            return;
        }
        int mid = n / 2;
        int[] left = new int[mid];
        int[] right = new int[n - mid];

        for (int i = 0; i < mid; i++) {
            left[i] = a[i];
        }

        for (int i = mid; i < n; i++) {
            right[i - mid] = a[i];
        }

        // divide
        mergeSort(left, mid);
        mergeSort(right, n - mid);

        // merge
        merge(a, left, right, mid, n - mid);

    }

    public static void merge(int a[], int[] left, int[] right, int l, int r) {
        int i = 0;
        int j = 0;
        int k = 0;

        while (i < l && j < r) {
            if (left[i] <= right[j]) {
                a[k++] = left[i++];
            } else {
                a[k++] = right[j++];
            }
        }

        while (i < l) {
            a[k++] = left[i++];
        }

        while (j < r) {
            a[k++] = right[j++];
        }
    }

    public static void bubbleSort(int[] a, int n) {
        for (int i = 0; i < a.length - 1; i++) {
            for (int j = i; j < a.length; j++) {
                if (a[i] > a[j]) {
                    a[i] = a[i] + a[j];
                    a[j] = a[i] - a[j];
                    a[i] = a[i] - a[j];
                }
            }
        }
    }

    public static void printArray(int[] a) {
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + ", ");
        }
        System.out.println();
    }

}