package com.dicoding.javafundamental.accessmodifier.pack4;

public class Perhitungan {
    final int nilai = 5;

    void ubahNilai(){
        // Kode di bawah akan menampilkan error
        //nilai = 10; //Error: Cannot assign a value to final variable 'nilai'
    }
}
