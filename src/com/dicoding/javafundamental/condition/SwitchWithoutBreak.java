package com.dicoding.javafundamental.condition;

public class SwitchWithoutBreak {
    public static void main(String[] args) {
        char input1 = 'B';
        int output = 0;
        switch (input1) {
            case 'A':
                output++;
            case 'B':
                output++;
            case 'C':
                output++;
            default:
                output++;
        }
        System.out.println("Nilai akhirnya adalah " + output);

        System.out.println("\n\n contoh program 2: ");
        int input = 1;
        switch (input) {
            case 1:
                System.out.print("-1-");
            case 2:
                System.out.print("-2-");
            case 3:
                System.out.print("-3-");
            case 4:
                System.out.print("-4-");
            default:
                System.out.print("Default: 0");
                break;
        }
    }
}
