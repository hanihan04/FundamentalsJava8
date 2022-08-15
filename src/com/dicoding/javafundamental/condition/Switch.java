package com.dicoding.javafundamental.condition;

public class Switch {
    public static void main(String[] args) {
        int input = 2;
        switch (input) {
            case 1:
                System.out.println("1");
                break;
            case 2:
                System.out.println("2");
                break;
            default:
                System.out.println("Default: nilai tidak termasuk dalam pilihan");
                break;
        }
    }
}
