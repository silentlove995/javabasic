package com.company.sortalgorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class QuickSort {
    public static Random rand = new Random();
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int[] arr;
        int n;
        System.out.print("Insert limit of array: ");
        n = scanner.nextInt();
        arr = insert(n);
        System.out.println("Array before sort: " + Arrays.toString(arr));
        long sortTime = System.currentTimeMillis();
        //Arrays.sort(arr);
        quickSort(arr, 0, n - 1);

        System.out.println("Array after sort: " + Arrays.toString(arr));
        System.out.println("Sort time: " + (System.currentTimeMillis() - sortTime));
        System.out.println("Runtime: " + (System.currentTimeMillis() - startTime));
    }

    public static void swap(int[] arr, int i, int j){
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /* The main function that implements QuickSort
          arr[] --> Array to be sorted,
          low --> Starting index,
          high --> Ending index
    */
    static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            // pi is partitioning index, arr[p]
            // is now at right place
            int pi = partition(arr, low, high);

            // Separately sort elements before
            // partition and after partition
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    /* This function takes last element as pivot, places
   the pivot element at its correct position in sorted
   array, and places all smaller (smaller than pivot)
   to left of pivot and all greater elements to right
   of pivot */
    static int partition(int[] arr, int low, int high) {
        // pivot
        int pivot = arr[high];

        // Index of smaller element and
        // indicates the right position
        // of pivot found so far
        int i = (low - 1);

        for(int j = low; j <= high - 1; j++) {
            // If current element is smaller
            // than the pivot
            if (arr[j] < pivot) {
                // Increment index of
                // smaller element
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return (i + 1);
    }

    public static int[] insert(int n){
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = rand.nextInt(10000);
        }
        return x;
    }
}
