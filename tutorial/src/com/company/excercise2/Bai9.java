package com.company.excercise2;

import java.util.Scanner;

public class Bai9 {

    /*       A[3][4]             B[4][3]        C[3][3]
        i..j_0_1_2_3___          _0_1_2__
        0..  1 2 3 4          0.. 1 3 3         c[i][j]
        1..  2 3 5 0          1.. 2 8 5
        2..  7 5 2 3          2.. 6 4 1
                              3.. 2 1 1
     */
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        int m,n,k;
        int[][] a,b,c;
        System.out.print("Insert first side of matrix a: ");
        m = scanner.nextInt();
        System.out.print("Insert second side of matrix a: ");
        n = scanner.nextInt();
        System.out.println("Insert matrix a: ");
        a = insert(m, n , scanner);
        System.out.print("Insert second side of matrix b: ");
        k = scanner.nextInt();
        System.out.println("Insert matrix b: ");
        b = insert(n, k, scanner);
        System.out.println("Matrix a: ");
        show(a);
        System.out.println("Matrix b: ");
        show(b);
        System.out.println("Result of multiplication: ");
        c = multipleMatrix(a, b);
        show(c);
    }

    public static int[][] insert(int m, int n, Scanner scanner) {
        int[][] x = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                x[i][j] = scanner.nextInt();
            }
        }
        return x;
    }

    public static void show(int[][] x){
        for (int[] ints : x) {
            for (int j = 0; j < x[0].length; j++) {
                System.out.printf("%5d", ints[j]);
            }
            System.out.println();
        }
    }

    public static int[][] multipleMatrix(int[][] a, int[][] b){
        int[][] c = new int[a.length][b[0].length];
        int m = a.length;
        int n = b[0].length;
        int k = a[0].length;
        for (int i = 0; i < m; i++) {
            for(int j = 0; j < n; j++){
                for (int l = 0; l < k; l++) {
                    c[i][j] += a[i][l] * b[l][j];
                }
            }
        }
        return c;
    }
}
