package pl.sda.zdjavapol75.petle;

import java.util.Scanner;

/*
Wczytywanie i powtarzanie slow tak dlugo, az slowo wpisane nie bedzie brzmialo "stop"
 */
public class PetlaWhile2 {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            System.out.println("Podaj slowo ktore mam powtorzyc, albo wpisz \"stop\" aby przerwac prace.");
            String slowo = scanner.nextLine();
            while (!slowo.equals("stop")) {
                System.out.println(slowo);
                System.out.println("Podaj slowo ktore mam powtorzyc, albo wpisz \"stop\" aby przerwac prace.");
                slowo = scanner.nextLine();
            }
            System.out.println("Koniec pracy");
        }
    }

