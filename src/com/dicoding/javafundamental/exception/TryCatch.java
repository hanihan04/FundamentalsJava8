package com.dicoding.javafundamental.exception;

import java.io.File;
import java.io.FileReader;

public class TryCatch {
    public static void main(String[] args) {
        //Before : begin
//        String location = "D://namafile.c";
//        File file = new File(location);
//        FileReader fr = new FileReader(file);
        //Before :  end

        //after : begin
        try {
            // Mencoba membaca berkas latihan.txt
            File file = new File("D://latihan.txt");
            FileReader fr = new FileReader(file);
            // Jika berhasil maka tampilkan pesan
            System.out.println("Read file berhasil");
        } catch (Exception e) {
            // Jika terjadi kesalahan maka tampilkan pesan
            System.out.println(e.getMessage());
        }
        //after : end

    }
}
