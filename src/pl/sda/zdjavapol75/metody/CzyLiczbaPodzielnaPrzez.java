package pl.sda.zdjavapol75.metody;

/*
Zadanie 1
Napisz program, który sprawdza czy liczba podana przez użytkownika jest podzielna przez 3 lub 5.
Zadanie 2*
Napisz program który pozwala użytkownikowi samemu zdecydować podzielność przez jaką liczbę będzie badana.
 */

import java.util.Scanner;

public class CzyLiczbaPodzielnaPrzez {

    public static void main(String[] args) {
        // Zadanie 1
        System.out.println(sprawdzCzyPodzielnaPrzez3lub5(pobierzLiczbyodUzytkownika()));
        //Zadanie 2
        System.out.println(sprawdzCzyPodzielnaPrzezDanaLiczbe(pobierzLiczbyodUzytkownika(), wyznaczDzielnik()));

    }

    public static int pobierzLiczbyodUzytkownika() {
        System.out.println("Podaj liczbę: ");
        Scanner scanner = new Scanner(System.in);
        int liczba = scanner.nextInt();
        return liczba;
    }

    public static boolean sprawdzCzyPodzielnaPrzez3lub5(int liczba) {
        System.out.println("Czy liczba jest podzielna przez 3 lub 5:");
        return liczba % 3 == 0 || liczba % 5 == 0;
    }
    public static int wyznaczDzielnik(){
        System.out.println("Podaj dzielnik: ");
        Scanner scanner = new Scanner(System.in);
        int dzielnik = scanner.nextInt();
        return dzielnik;
    }
    public static boolean sprawdzCzyPodzielnaPrzezDanaLiczbe(int liczbaOdUzytkownika, int dzielnikOdUzytkownika) {
        System.out.println("Czy liczba jest podzielna przez podany przez Ciebie dzielnik:");
        return liczbaOdUzytkownika % dzielnikOdUzytkownika == 0;
    }

}
