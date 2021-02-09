package pl.sda.zdjavapol75.input;

import java.util.Scanner;

public class Wiek {
    public static void main(String[] args) {

        System.out.println("Podaj swój wiek.");

        Scanner input = new Scanner(System.in);
        int wiek = input.nextInt();
        System.out.println("Masz " + wiek + " lat.");
    }
}
