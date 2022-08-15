package studikasus;

import java.util.Scanner;

public class SuhuAir {
    public static void main(String[] args) {
        //contoh pemakaian IF 3 kasus: wujud air
        int T;
        System.out.println("Contoh IF 3 kasus");
        System.out.print("Suhu (der. C) = ");
        Scanner scanner = new Scanner(System.in);
        T = scanner.nextInt(); //input nilai

        //proses pengecekan
        if(T<0){
            System.out.println("Wujud air beku "+T);
        } else if ((0 <= T) && (T <= 100)) {
            System.out.println("Wujud air cair "+T);
        } else if (T > 100) {
            System.out.println("Wujud air uap/gas "+T);
        }
    }
}
