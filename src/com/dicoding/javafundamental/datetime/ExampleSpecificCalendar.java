package com.dicoding.javafundamental.datetime;

import java.util.Calendar;

public class ExampleSpecificCalendar {
    public static void main(String[] args) {
        Calendar calendar = Calendar.getInstance(); // Menampilkan waktu sekarang
        System.out.println("Waktu sekarang adalah " + calendar.getTime());
        calendar.add(Calendar.DATE, -15); // Menampilkan waktu 15 hari yang lalu
        System.out.println("15 hari yang lalu: " + calendar.getTime());
        calendar.add(Calendar.MONTH, 4); // Menampilkan waktu 4 bulan yang akan datang
        System.out.println("4 bulan kemudian: " + calendar.getTime());
        calendar.add(Calendar.YEAR, 2); // Menampilkan waktu 2 tahun yang akan datang
        System.out.println("2 tahun kemudian: " + calendar.getTime());
    }
}
