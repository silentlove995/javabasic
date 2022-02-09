package com.company.sortalgorithm;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BubbleSort {
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

        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                if (arr[j] > arr[j+1]){
                    // swap arr[j+1] and arr[j]
                    int temp = arr[j];
                    arr[j] = arr[j+1];
                    arr[j+1] = temp;
                }
            }
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
