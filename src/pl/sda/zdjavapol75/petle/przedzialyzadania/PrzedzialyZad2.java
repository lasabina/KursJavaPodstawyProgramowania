package pl.sda.zdjavapol75.petle.przedzialyzadania;

import java.util.Scanner;

/*
Zadanie domowe:
2. Stworz program ktory pobiera od uzytkownika dwie liczby (a,b),
a nastepnie wypisuje wszystkie liczby nieparzyste z przedzialu od a do b (bez a i bez b)
 */
public class PrzedzialyZad2 {
    public static void main(String[] args) {

        System.out.println("Użytkowaniku podaj 1 liczbę do utworzenia przedziału: ");

        Scanner input = new Scanner(System.in);
        int liczba1 = input.nextInt();

        System.out.println("Użytkowaniku podaj 2 liczbę do utworzenia przedziału: ");
        int liczba2 = input.nextInt();

        System.out.println("Oto liczby nieparzyste z podanego przez Ciebie przedziału: ");
        for (int i = liczba1+1; i <liczba2 ; i++) {
            if (i%2 != 0)
            System.out.println(i);

        }

    }
}
