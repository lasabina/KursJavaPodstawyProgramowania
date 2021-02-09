package pl.sda.zdjavapol75.petle;

import java.util.Scanner;

public class PolChoinki {
    public static void main(String[] args) {
        System.out.println("Podaj proszę wysokość choinki:");
        Scanner odpowiedz = new Scanner(System.in);
        int wysokosc = odpowiedz.nextInt();

        for (int i = 1; i <= wysokosc; i++) {
            for (int j = 0; j < i; j++) System.out.print("*");

            System.out.println("");

        }
    }
}
