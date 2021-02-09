package pl.sda.zdjavapol75.petle;

import java.util.Scanner;

/*
1.	Napisz program, który przyjmuje od użytkownika dzielnik oraz liczbę,
a następnie drukuje na ekranie wszystkie liczby mniejsze od zadanej liczby podzielne przez zadany dzielnik
 */
public class Dzielniki {
    public static void main(String[] args) {


        Scanner input = new Scanner(System.in);
        System.out.println("Podaj dzielnik:");
        int dzielnik = input.nextInt();
        System.out.println("Podaj liczbę: ");
        int liczba = input.nextInt();

        for (int i = liczba - 1; i > 0; i--) {
            if (i % dzielnik == 0) {

                System.out.println(i);
            }


        }
    }
}
