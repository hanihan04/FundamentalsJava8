package com.dicoding.javafundamental.looping;

public class DoWhile {
    public static void main(String[] args) {
        int value = 1;
        do {
            System.out.print("-" + value + "-");
            value++;
        } while (value <= 10);
    }
}
