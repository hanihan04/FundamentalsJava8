package com.dicoding.javafundamental.looping;

public class NastedFor {
    public static void main(String[] args) {
        int a = 5;
        System.out.println("Segitiga: increment secara horizontal");
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i);
            }
            System.out.println("");
        }

        System.out.println("\nSegitiga: increment secara vertical");
        for (int i = 0; i <= a; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
