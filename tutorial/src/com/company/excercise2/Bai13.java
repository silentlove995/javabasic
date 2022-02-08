package com.company.excercise2;

public class Bai13 {
    public static void main(String[] args) {
        int count = 0;
        for (int i = 100000000; i < 999999999; i++) {
            if(isReversed(i + "")){
                System.out.printf("%12d", i);
                count++;
                if(count % 12 == 0){
                    System.out.println();
                }
            }
        }
        System.out.println("\n" + count);
    }

    public static boolean isReversed(String s){
        String other;
        StringBuilder builder = new StringBuilder(s);
        other = builder.reverse().toString();

        return (s.compareTo(other) == 0);
    }
}
