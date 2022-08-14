package com.dicoding.javafundamental.accessmodifier.pack4;

public class Main {
    public static void main(String[] args) {
        System.out.println("Nilainya adalah " + Perhitungan.nilai);

        for (int x = 0 ; x < 5; x++){
            new Perhitungan();
        }
        System.out.println("Sampai "+ Perhitungan.nilai);

        //AccessModifier #2: Static Method - Begin
        System.out.println("getNilai memiliki nilai " + Perhitungan.getNilai());
        //AccessModifier #2: Static Method - End
    }
}
