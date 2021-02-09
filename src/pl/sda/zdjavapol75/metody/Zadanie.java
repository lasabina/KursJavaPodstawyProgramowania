package pl.sda.zdjavapol75.metody;

import java.util.Scanner;

public class Zadanie {
    public static void main(String[] args) {
        int[] pobraneOdUzytkownika = pobierzDwieLiczby();

        int sumaLiczbUżytkownika = sumujElementyTablicy(pobraneOdUzytkownika);

        wypiszLiczbeNaEkran(sumaLiczbUżytkownika);

        // Powyższe linijki możemy uprościć do:
        wypiszLiczbeNaEkran(sumujElementyTablicy(pobierzDwieLiczby()));
    }


    public static int[] pobierzDwieLiczby() {   //musi być int[], bo chcemy mieć tablicę
        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj pierwszą liczbę:");
        int wczytywaniePierwsza = scanner.nextInt();
        System.out.println("Podaj drugą liczbę:");
        int wczytywanieDrugą = scanner.nextInt();
        int[] wczytaneLiczby = new int[]{wczytywaniePierwsza, wczytywanieDrugą};

        return wczytaneLiczby;
    }

    public static int sumujElementyTablicy(int[] tablicaDoZsumowania) {
        int suma = 0;
        for (int i = 0; i < tablicaDoZsumowania.length; i++) {
            suma += tablicaDoZsumowania[i];
        }
        return suma;
    }

    public static void wypiszLiczbeNaEkran(int liczbaDoWyswietlenia) {
        System.out.println("Suma to:");
        System.out.println(liczbaDoWyswietlenia);
    }
}
