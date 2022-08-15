package studikasus.part3;

import java.util.Scanner;

public class Main {
    private static int pilihan;
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        //panggil metode
        mainMenu();
    }

    private static void mainMenu(){
        PersegiPanjang opersegi;
        SegitigaSiku osegitiga;
        Lingkaran olingkaran;
        int s1, s2, r;

        opersegi = new PersegiPanjang();
        osegitiga = new SegitigaSiku();
        olingkaran = new Lingkaran();

        //pilihan menu
        System.out.println("\n\n====================");
        System.out.println("Hitung Luas dan Keliling :");
        System.out.println("1. Persegi Panjang");
        System.out.println("2. Segitiga Siku");
        System.out.println("3. Lingkaran");
        System.out.println("0. Keluar");
        System.out.println("====================");
        System.out.print("Masukan Menu : ");
        pilihan = scanner.nextInt();
        System.out.println("====================");

        //kondisional untuk pilihan menu yang dimasukan
        switch(pilihan){
            case 1:{
                System.out.print("Masukan panjang persegi: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan lebar persegi: ");
                s2 = scanner.nextInt();
                System.out.println("Luas persegi panjang: " + opersegi.luas(s1,s2));
                System.out.println("Keliling persegi panjang: " + opersegi.keliling(s1,s2));
                exitQuestion();
                break;
            }
            case 2:{
                System.out.print("Masukan alas segitiga siku: ");
                s1 = scanner.nextInt();
                System.out.print("Masukan tinggi segitiga siku: ");
                s2 = scanner.nextInt();
                System.out.println("Luas segitiga: " + osegitiga.luas(s1,s2));
                System.out.println("Sisi Miring segitiga: " + osegitiga.sisimiring(s1,s2));
                System.out.println("Keliling segitiga: " + osegitiga.keliling(s1,s2));
                exitQuestion();
                break;
            }
            case 3:{
                System.out.print("Masukan jari-jari lingkaran: ");
                r = scanner.nextInt();
                System.out.println("Luas lingkaran: " + olingkaran.luas(r));
                System.out.println("Keliling lingkaran: " + olingkaran.keliling(r));
                exitQuestion();
                break;
            }
            case 0:{
                System.out.println("---- KELUAR??? ----");
                exitQuestion();
                break;
            }
            default :{
                System.out.println("tidak ada pilihan");
                exitQuestion();
                break;
            }
        }
    }

    private static void exitQuestion(){
        System.out.println("-----------------------");
        System.out.print("Apakah anda ingin keluar (y/n)? ");
        char keluar = scanner.next().charAt(0);
        if(keluar == 'n'){
            System.out.println("********************************");
            mainMenu();
        } else if (keluar == 'y') {
            System.out.println("---- Terima Kasih ----");
            System.exit(0);
        }

    }
}
