package com.dicoding.javafundamental.inheritance;

public class Hewan {
    public Hewan() {
        System.out.println("construct Hewan");
    }

    //Overriding & Overloading : Begin
    public void makan() { // overriding
        System.out.println("Kucing sedang makan..");
    }

    public void makan(String food) { // overloading
        System.out.println("Kucing makan " + food);
    }
    //Overriding & Overloading : End
}
