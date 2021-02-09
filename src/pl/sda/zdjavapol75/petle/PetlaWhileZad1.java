package pl.sda.zdjavapol75.petle;

import java.util.Scanner;

/*
1.	Napisz program, który oblicza sumę wszystkich liczb
poprzedzających zadaną przez użytkownika liczbę – dla liczby 100 będzie to suma liczb od 0 do 100 czyli 5050

 */
public class PetlaWhileZad1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Podaj liczbę: ");

        int liczba = input.nextInt();
        int suma = 0;

        while (liczba >= 0){
            suma = suma + liczba;
            liczba--;
        }
            System.out.println(suma );
        }
    }