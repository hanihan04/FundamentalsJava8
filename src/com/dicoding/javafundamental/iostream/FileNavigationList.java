package com.dicoding.javafundamental.iostream;

import java.io.File;

public class FileNavigationList {
    public static void main(String args[]) {
        String dirname = "/java/latihan1";
        File file = null;
        String[] paths;
        try {
            file = new File(dirname); // Instansiasi objek File
            paths = file.list(); // Ambil list files dan masukkan ke string paths
            // Tampilkan semua path yang ada
            for (String path : paths) {
                System.out.println(path);
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
