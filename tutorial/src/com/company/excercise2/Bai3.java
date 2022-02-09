package com.company.excercise2;

import java.util.Scanner;

public class Bai3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n, x, index = -1, min = Integer.MAX_VALUE;
        int[] arr;
        System.out.print("Enter limit of array: ");
        n = scanner.nextInt();
        System.out.print("Enter x: ");
        x = scanner.nextInt();

        arr = new int[n];
        System.out.println("Enter element of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < n; i++) {
            int currentMin = getMin(arr[i], x);
            if (primeNumber(arr[i]) && currentMin < min){
                min = currentMin;
                index = i;
            }
        }

        if (index != -1){
            System.out.println("Index of element: " +index+" , value: " + arr[index]);
        }else{
            System.out.println("Satisfy element not found");
        }
    }

    public static int getMin(int a, int x){
        return Math.abs(a-x);
    }

    public static boolean primeNumber(int n){
        if (n < 2){
            return false;
        }
        int a = (int) Math.sqrt(n);
        for (int i = 2; i <= a ; i++) {
            if (n % i == 0){
                return false;
            }
        }
        return true;
    }
}
