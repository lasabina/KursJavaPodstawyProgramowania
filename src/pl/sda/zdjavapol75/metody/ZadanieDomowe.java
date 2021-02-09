package pl.sda.zdjavapol75.metody;
/*
Zadanie 12.
Napisać program, który sprawdza, czy podana liczba całkowita N jest większa od
zera, a następnie sprawdzająca czy liczba jest liczbą pierwszą.
 */

import java.util.Scanner;

public class ZadanieDomowe {
    public static void main(String[] args) {
/*
        int liczba = pobieranieLiczbyDodatniej();
        int licznik = licznikDzielnikow(liczba);
        liczbaPierwszaCzyNie(licznik);
*/
        sprawdzCzyLiczbaPierwszaCzyNie(zliczDzielniki(pobieranieLiczbyDodatniej()));
    }


    public static int pobieranieLiczbyDodatniej() {
        System.out.println("Podaj liczbę całkowitą większą od 0:");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        while (liczba <= 0) {
            System.out.println("Podana libcza nie jest większa od 0. Podaj jeszcze raz: ");
            liczba = scanner.nextInt();
        }
        return liczba;
    }

    public static int zliczDzielniki(int liczbaOdUzytkownika) {
        int licznik = 1;
        for (int i = 1; i < liczbaOdUzytkownika; i++) {
            if (liczbaOdUzytkownika % i == 0) {
                licznik += 1;
            }
        }
        return licznik;
    }

    public static void sprawdzCzyLiczbaPierwszaCzyNie(int licznikDzielnikow) {
        if (licznikDzielnikow == 1) {
            System.out.println("Podana liczba nie jest liczbą pierwszą ani liczbą złożoną.");
        }
        if (licznikDzielnikow == 2) {
            System.out.println("Podana przez Ciebie libcza jest liczbą pierwszą.");
        }
        if (licznikDzielnikow > 2) {
            System.out.println("Podana przez Ciebie libcza nie jest liczbą pierwszą.");
        }
    }
}

