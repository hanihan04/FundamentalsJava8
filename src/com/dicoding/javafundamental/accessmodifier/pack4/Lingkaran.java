package com.dicoding.javafundamental.accessmodifier.pack4;

final class Lingkaran {
    static final double PI = 3.141;

    int jari = 7;

    final double getLuas() {
        return PI * (jari * jari);
    }
}
