package com.dicoding.javafundamental.accessmodifier;

public class Main {
    public static void main(String[] args) {
        KelasA kelasA = new KelasA();

        //System.out.println(kelasA.memberA);
        //System.out.println(kelasA.functionA());

        System.out.println(kelasA.functionB());

        //AccessModifier #2: Default - Begin
        System.out.println(kelasA.memberB);
        System.out.println(kelasA.memberC);
        //AccessModifier #2: Default - End
    }
}
