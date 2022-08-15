package com.dicoding.javafundamental.accessmodifier.pack3;

public class Perhitungan {
    public static int nilai = 0;

    //AccessModifier #2: Static Method - Begin
    protected static int getNilai(){
        return nilai;
    }
    //AccessModifier #2: Static Method - End

    Perhitungan(){
        nilai++;
    }
}
