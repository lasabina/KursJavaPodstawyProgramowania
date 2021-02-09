package pl.sda.zdjavapol75.metody;

import java.util.Scanner;

public class MetodyZadanie1 {
    public static void main(String[] args) {

        sprawdzCzyLiczbaParzystaCzyNie(pobierzLiczbe());

        System.out.println(sprawdzCzyLiczbaJestParzysta(pobierzLiczbe()));
    }

    public static int pobierzLiczbe() {
        System.out.println("Podaj liczbę całkowitą:");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();

        return liczba;
    }

    public static void sprawdzCzyLiczbaParzystaCzyNie(int liczbaOdUzytkowanika) {
        if (liczbaOdUzytkowanika % 2 == 0) {
            System.out.println("Podana liczba jest liczbą parzystą.");
        }
        if (liczbaOdUzytkowanika % 2 != 0) {
            System.out.println("Podana liczba nie jest liczbą parzystą.");
        }
    }

    public static boolean sprawdzCzyLiczbaJestParzysta(int liczbaOdUzytkownika) {
//        if (liczbaOdUzytkownika % 2 == 0) {
//            return true;
//        } else {
//            return false;
//        }
        //Można to zapisać od razu jako:
        return liczbaOdUzytkownika % 2 == 0;
    }
}

