package com.dicoding.javafundamental.accessmodifier.pack2;

import com.dicoding.javafundamental.accessmodifier.pack1.KelasA;

public class Main {
    public static void main(String[] args) {
        KelasA kelasA = new KelasA();
        //System.out.println(kelasA.functionB()); //functionB error
        //AccessModifier #2: Default - Begin
        //System.out.println(kelasA.memberB); //memberB error
        //System.out.println(kelasA.memberC); //memberC error
        //AccessModifier #2: Default - End

        //AccessModifier #3: Protected - Begin
        KelasB kelasB = new KelasB();
        kelasB.methodC();
        //AccessModifier #3: Protected - End
    }
}
