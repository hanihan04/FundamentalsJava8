package com.dicoding.javafundamental.iostream;

import java.io.File;

public class FileNavigationMkdirs {
    public static void main(String[] args) {
        String dirname = "/java/latihan1";
        File file = new File(dirname);

        file.mkdirs();  // Buat directory
    }
}
