package com.company.excercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai5 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int[] a, b, c;
        int m, n, k, p;
        System.out.print("Enter limit of array a: ");
        m = scanner.nextInt();
        System.out.print("Insert element of array a[] have " + m + " elements: ");
        a = insert(m);
        System.out.print("Enter limit of array b: ");
        n = scanner.nextInt();
        System.out.print("Insert element of array b[] have " + n + " elements: ");
        b = insert(n);
        k = m + n;
        c = new int[k];

        System.out.println("Enter insert index: ");
        do {
            p = scanner.nextInt();
        }while (p >= m || p < 0);

        //copy array a into array c till p:
        System.arraycopy(a, 0, c, 0, p);

        //copy  array b into array c:
        System.arraycopy(b, 0, c, p, n-1);

        //copy another path of array a[] into array c:
        System.arraycopy(a,p,c,p+n,m-1);

        System.out.println("Array a[]: " + Arrays.toString(a));
        System.out.println("Array b[]: " + Arrays.toString(b));
        System.out.println("Array c[]: " + Arrays.toString(c));
    }

    public static int[] insert(int n){
        int[] x = new int[n];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        return x;
    }
}
