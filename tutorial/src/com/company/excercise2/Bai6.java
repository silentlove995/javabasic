package com.company.excercise2;

import java.util.Arrays;
import java.util.Scanner;

public class Bai6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr;
        int n,x;
        System.out.print("Enter limit of array: ");
        n = scanner.nextInt();
        System.out.print("Insert element of arr[] have " + n + " element: ");
        arr = insert(n, scanner);
        System.out.print("Enter x to insert: ");
        x = scanner.nextInt();

        int index = -1;
        for (int i = 0; i < n; i++) {
            if (arr[i] > x){
                index = i;
                break;
            }
        }

        if (index == -1){
            //insert into end of array
            arr[n] = x;
        }else {
            //move all element to right from index
            //System.arraycopy(arr, n-1, arr, n, index - 1 );
            for (int i = n; i > index ; i--) {
                arr[i] = arr[i - 1];
            }
            arr[index] = x;
        }
        System.out.println(Arrays.toString(arr));
    }

    public static int[] insert(int n, Scanner scanner){
        int[] x = new int[n + 1];
        for (int i = 0; i < n; i++) {
            x[i] = scanner.nextInt();
        }
        return x;
    }
}
