package pl.sda.zdjavapol75.input;

import java.util.Scanner;

/*
Zadanie:
1) Poproś użytkownika o imię.
2) Powitaj użytkownika: "Witaj <tutaj jego imię>!".
 */
public class Witacz {
    public static void main(String[] args) {
        System.out.println("Witaj, podaj swoje imię.");

        Scanner input = new Scanner(System.in);
        String imie = input.nextLine();

        System.out.println("Witaj " + imie +"!");

    }
}
