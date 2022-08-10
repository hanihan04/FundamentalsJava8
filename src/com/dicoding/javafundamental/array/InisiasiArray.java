package com.dicoding.javafundamental.array;

public class InisiasiArray {
    public static void main(String[] args) {
        //inisiasi cara pertama ver.a
        int[] arrInt1a = new int[]{1, 2, 3, 4, 5, 6};
        System.out.println(arrInt1a[0]);
        System.out.println(arrInt1a[1]);
        System.out.println(arrInt1a[2]);
        System.out.println(arrInt1a[3]);
        System.out.println(arrInt1a[4]);
        System.out.println(arrInt1a[5]);

        //inisiasi cara pertama ver.b
        System.out.println("\n");
        int[] arrInt1b = {1, 2, 3, 4, 5, 6};
        System.out.println(arrInt1b[0]);
        System.out.println(arrInt1b[1]);
        System.out.println(arrInt1b[2]);
        System.out.println(arrInt1b[3]);
        System.out.println(arrInt1b[4]);
        System.out.println(arrInt1b[5]);

        //inisiasi cara kedua
        System.out.println("\n");
        int[] arrInt2 = new int[6];
        arrInt2[0] = 1;
        arrInt2[1] = 2;
        arrInt2[2] = 3;
        arrInt2[3] = 4;
        arrInt2[4] = 5;
        arrInt2[5] = 6;

        System.out.println(arrInt2[0]);
        System.out.println(arrInt2[1]);
        System.out.println(arrInt2[2]);
        System.out.println(arrInt2[3]);
        System.out.println(arrInt2[4]);
        System.out.println(arrInt2[5]);
    }
}
