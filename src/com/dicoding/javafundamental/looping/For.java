package com.dicoding.javafundamental.looping;

public class For {
    public static void main(String[] args) {
        System.out.println("contoh dengan i++");
        for (int i = 1; i <= 4; i++) {
            System.out.println("Angka ke-" + i);
        }

        System.out.println("\ncontoh dengan ++j");
        for (int j = 1; j <= 4; ++j) {
            System.out.println("Angka ke-" + j);
        }

        //Kesimpulan sama saja.

        System.out.println("\ncontoh dengan DECREMENT");
        for (int i = 4; i >= 1; i--) {
            System.out.println("Angka ke-" + i);
        }
    }
}
