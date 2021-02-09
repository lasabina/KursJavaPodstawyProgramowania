package pl.sda.zdjavapol75.petle.doWhile;

import java.util.Scanner;

/*
1.	Napisz program, który wypisuje wszystkie liczby mniejsze od zadanej od użytkownika dopóki
użytkownik wpisuje liczby większe od 0
 */
public class DoWhileZad1 {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int liczba;

        do {
            System.out.println("Podaj jakąś liczbę większą od 0: ");
            liczba = input.nextInt();
            if (liczba <= 0){
                break;
            }
            for (int i = liczba-1; i >0 ; i--) {
                System.out.println(i);
            }

        } while(liczba!=0);

    }
}
