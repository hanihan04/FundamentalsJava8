package com.dicoding.javafundamental.casting;


public class CastingVariable {
    public static void main(String[] args) {
        float a = (float) 3.14;
        int b = (int) a;
        String c = String.valueOf(a);

        System.out.println("variabel a ("+((Object)a).getClass().getSimpleName()+") = "+a);
        System.out.println("variabel b ("+((Object)b).getClass().getSimpleName()+") = "+b);
        System.out.println("variabel c ("+((Object)c).getClass().getSimpleName()+") = "+c);
    }
}
