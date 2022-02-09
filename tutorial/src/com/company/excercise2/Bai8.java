package com.company.excercise2;

import java.util.Scanner;


public class Bai8 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int m,n;
        int[][] arr, brr;
        System.out.print("Enter first side of matrix: ");
        m = scanner.nextInt();
        System.out.print("Enter second side of matrix: ");
        n = scanner.nextInt();
        System.out.println("Enter matrix: ");
        arr = insert(m,n, scanner);
        brr = transposition(arr);
        System.out.println("Source matrix: ");
        show(arr);
        System.out.println("Matrix after transposition: ");
        show(brr);
    }

    public static int[][] transposition(int[][] arr){
        int m,n;
        m = arr.length;
        n = arr[0].length;
        int[][] brr = new int[n][m];
        for (int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++){
                brr[i][j] = arr[j][i];
            }
        }
        return brr;
    }

    public static int[][] insert(int m, int n, Scanner scanner){
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
                x[i][j] = scanner.nextInt();
            }
        }
        return x;
    }

    public static void show(int[][] arr){
        int n = arr[0].length;
        for (int[] ints : arr) {
            for (int j = 0; j < n; j++) {
                System.out.print(ints[j] + " ");
            }
            System.out.println();
        }
    }
}
