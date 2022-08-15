package com.dicoding.javafundamental.array;

public class LoopingArray {
    public static void main(String[] args) {
        int[] arrInt = new int[30];
        char[] arrChar = new char[]{'h','a','n','0','4'};
        String[] arrString = new String[]{"Hanifah","aprilia","Nur\'aini"};

        // Inisiasi dan menampilkan arrInt dari elemen ke 1 sampai 30
        for (int x = 0; x < arrInt.length; x++) {
            arrInt[x] = x + 1;
            System.out.println(arrInt[x]);
        }

        System.out.println("Array baru lagi: ");
        for (int a=0; a<arrChar.length; a++){
            System.out.println(arrChar[a]);
            arrChar[a] += 1;
        }

        System.out.println("Array String: ");
        for(int h=0; h<arrString.length; h++){
            System.out.println(arrString[h]);
            arrString[h] += 1;
        }
    }
}
