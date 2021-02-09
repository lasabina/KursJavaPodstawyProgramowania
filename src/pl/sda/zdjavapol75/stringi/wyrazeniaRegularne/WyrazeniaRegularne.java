package pl.sda.zdjavapol75.stringi.wyrazeniaRegularne;

import java.util.Scanner;

public class WyrazeniaRegularne {


    public static String zlaczCiagi(String pierwszy, String drugi) {
        // usniecie znaków z początku i konca linii
        pierwszy = pierwszy.trim();
        drugi = drugi.trim();

        // usunięcie 2 znaków z konca i z poczatku
        pierwszy = pierwszy.substring(2, pierwszy.length() - 2);
        drugi = pierwszy.substring(2, pierwszy.length() - 2);
        return pierwszy.concat(drugi);
    }

    public static String pobierzCiag1() {
        System.out.println("Podaj 1 ciąg");
        Scanner scanner = new Scanner(System.in);
        String zdanie1 = scanner.nextLine();
        return zdanie1;
    }

    public static String pobierzCiag2() {
        System.out.println("Podaj 2 ciąg");
        Scanner scanner = new Scanner(System.in);
        String zdanie2 = scanner.nextLine();
        return zdanie2;
    }

    public static String usunSamogloski(String zKtoregoSkasowac) {
        return zKtoregoSkasowac.replaceAll("[aeuouiyAEOUIY]", "");
    }

    public static String zamienSlowaZDuzejLitery(String zdanieDoSprawdzenia, String naCoZamienic) {
        return zdanieDoSprawdzenia.replaceAll("[A-Z]\\w*", naCoZamienic);

    }

    public static String zmienKoniecZdania(String zdanie){
        return zdanie.replace(".",".\n");
      //  return zdanie.replaceAll("\\.","\\.\n");

    }
}
