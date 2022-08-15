package com.dicoding.javafundamental.looping;

public class While {
    public static void main(String[] args) {
        int value = 1;
        while (value <= 4) {
            System.out.print("Angka ke-" + value);
            value++;
            System.out.print("; ");
        }
    }
}
