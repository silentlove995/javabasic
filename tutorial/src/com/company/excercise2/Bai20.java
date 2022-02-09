package com.company.excercise2;

public class Bai20 {
    public static void main(String[] args) {
        long startTime = System.currentTimeMillis();
//        String name = "Trong dep trai";
//        String str = "x";
//        str = str.replaceAll("x", "xxxxxxxxxx");
//        str = str.replaceAll("x", "xxxxxxxxxx");
//        str = str.replaceAll("x", "xxxxxxxxxx");
//        str = str.replaceAll("x", name + "\n");
//        System.out.println(str);
//        for (int i = 0; i < 1000; i++) {
//            System.out.println("Trong dep trai");
//        }
//        printName(1);

        String name = String.format("%01000d", 0).replace("0", "Dat\n");
        System.out.println(name);
        System.out.println(System.currentTimeMillis() - startTime);
    }

    static void printName(int count){
        count++;
        if (count < 1000){
            System.out.println("Trong dep trai");
            printName(count);
        }
    }
}
