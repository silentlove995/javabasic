package com.company.excercise2;

import java.util.Scanner;

public class Bai2 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        int n, count;
        int[] arr, res;
        System.out.print("Enter limit of array: ");
        n = scanner.nextInt();
        arr = new int[n];
        res = new int[n];
        System.out.println("Enter element of array: ");
        for (int i = 0; i < n; i++) {
            arr[i] = scanner.nextInt();
            res[i] = -1;
        }
        //count exist of elements in array
        for (int i = 0; i < n; i++) {
            count = 1;
            for(int j = i+1; j < n; j++){
                if (res[j] != 0 && arr[i]  == arr[j]){
                    count++;
                    res[j] = 0;
                }
            }
            if (res[i] != 0){
                res[i] = count;
            }
        }
        //find most appear element
        int max = res[0];
        for (int i = 0; i < n; i++) {
            if (res[i] > max){
                max = res[i];
            }
        }
        System.out.println("Most appear: " + max + ", elements: ");
        for (int i = 0; i < n; i++) {
            if (res[i] == max){
                System.out.print(arr[i]+ ", ");
            }
        }
        System.out.println("\b\b");
        System.out.println(System.currentTimeMillis() - startTime);
    }
}
