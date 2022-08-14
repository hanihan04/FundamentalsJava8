package com.dicoding.javafundamental.accessmodifier;

public class KelasA {
    private int memberA = 5;

    //AccessModifier #2: Default - Begin
    char memberB = 'A';
    double memberC = 1.5;
    //AccessModifier #2: Default - End

    private int functionA() {
        return memberA;
    }
    int functionB() {
        // Pemanggilan private member dan private function
        int hasil = functionA() + memberA;
        return hasil;
    }
}
