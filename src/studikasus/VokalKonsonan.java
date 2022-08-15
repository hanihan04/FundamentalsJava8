package studikasus;

import java.util.Scanner;

public class VokalKonsonan {
    public static void main(String[] args) {
        String word = "";
        String raw_word = "";
        int vokal = 0;
        int konsonan = 0;

        //masukan kalimat
        System.out.print("Masukan kalimat : ");
        Scanner scanner = new Scanner(System.in);
        raw_word = scanner.nextLine();
        word = raw_word.toLowerCase();

        //memanggil prosedur yang mengembalikan nilai int
        vokal = num_vokal(word);
        konsonan = num_konsonan(word);

        System.out.println("Jumlah huruf vokal : " +vokal);
        System.out.println("Jumlah huruf konsonan : " +konsonan);
    }

    private static int num_vokal(String word){
        int jumlah_vokal = 0;
        for (int i = 0; i < word.length(); i++){
            if(word.charAt(i) == 'a' || word.charAt(i) == 'i' || word.charAt(i) == 'u' || word.charAt(i) == 'e'|| word.charAt(i) == 'o'){
                jumlah_vokal++;
            }
        }
        return jumlah_vokal;
    }

    private static int num_konsonan(String word){
        int jumlah_konsonan = 0;
        for(int i=0; i<word.length(); i++){
            if(word.charAt(i) != 'a' && word.charAt(i) != 'i' && word.charAt(i) != 'u' && word.charAt(i) != 'e' && word.charAt(i) != 'o'){
                jumlah_konsonan++;
            }
        }
        return jumlah_konsonan;
    }
}
