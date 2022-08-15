package com.dicoding.javafundamental.casting;

public class Main {
    public static void main(String[] args) {
        Kucing anggora = new Kucing();

        Hewan hewan = anggora; //secara implisit upcasting
        hewan = (Hewan) anggora; //secara explisit melakukan casting dari subclass ke superclass

        Hewan hewan2 = new Kucing();
        ((Kucing) hewan2).eat();
        ((Kucing) hewan2).say(); //downcast hewan ke kucing, casting dari superclass ke subclass

        //contoh lain.
        System.out.println("-------------------");
        Dwaekki changbin = new Dwaekki();
        Hewan hewan4 = new Dwaekki();
        ((Dwaekki) hewan4).say();
        ((Dwaekki) hewan4).eat();
    }
}
