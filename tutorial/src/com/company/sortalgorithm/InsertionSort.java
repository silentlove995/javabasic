package com.company.sortalgorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class InsertionSort {
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
        int i, j, last;
        for (i = 1; i < n; ++i) {
            last = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > last){
                arr[j + 1] = arr[j];
                j = j - 1;
            }
            arr[j + 1] = last;
        }
        System.out.println("Array after sort: " + Arrays.toString(arr));
        System.out.println("Sort time: " + (System.currentTimeMillis() - sortTime));
        System.out.println("Runtime: " + (System.currentTimeMillis() - startTime));
    }


    public static int[] insert(int n){
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = rand.nextInt(200000);
        }
        return x;
    }
}
