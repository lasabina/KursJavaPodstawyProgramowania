package pl.sda.zdjavapol75.petle.przedzialyzadania;

import java.util.Scanner;

/*
Zadanie domowe:
3. Korzystajac z poprzednich zadań spraw, aby użytkownik sam wybierał,
czy chce zobaczyć liczby parzyste czy nieparzyste z przedziału, który podał.
 */
public class PrzedzialyZad3 {
    public static void main(String[] args) {

        System.out.println("Użytkowaniku podaj 1 liczbę do utworzenia przedziału: ");

        Scanner input = new Scanner(System.in);
        int liczba1 = input.nextInt();                  //Podanie przez użytkowanika 1. liczby

        System.out.println("Użytkowaniku podaj 2 liczbę do utworzenia przedziału: ");
        int liczba2 = input.nextInt();                  //Podanie przez użytkowanika 2. liczby
        input.nextLine();

        System.out.println("Użytkowaniku chcesz otrzymać liczby parzyste czy nieparzyste: ");
        String wybor = input.nextLine();                //Wybór użytkowanika liczb parzystych/nieparzystych

        switch (wybor) {                                //W zależności, co wybrał użytkownik
            case "parzyste":                                    //Jeżeli parzyste:
                if (liczba1 < liczba2) {                           // przy czym 1. jest mniejsza od 2.
                    System.out.println("Oto liczby parzyste z podanego przez Ciebie przedziału: ");
                    for (int i = liczba1 + 1; i < liczba2; i++) {   //Określam i jako 1.+1 aby ją wykluczyć
                        if (i % 2 == 0) {                       //reszta z dzielenia przez 2 ma być = 0
                            System.out.println(i);
                        }
                    }
                } else {                                    // w innym wypadku, tj. 1. liczba jest większa od 2.
                    System.out.println("Oto liczby parzyste z podanego przez Ciebie przedziału: ");
                    for (int i = liczba2 + 1; i < liczba1; i++) {   //Określam i jako liczba2 +1
                        if (i % 2 == 0) {                      //reszta z dzielenia przez 2 ma być = 0
                            System.out.println(i);
                        }
                    }
                }
                break;
            case "nieparzyste":
                if (liczba1 < liczba2) {
                    System.out.println("Oto liczby nieparzyste z podanego przez Ciebie przedziału: ");
                    for (int i = liczba1 + 1; i < liczba2; i++) {
                        if (i % 2 != 0) {              //żeby wyszły liczby nieparzyste, reszta z dzielenia musi być różna od 0
                            System.out.println(i);
                        }
                    }
                } else {
                    System.out.println("Oto liczby nieparzyste z podanego przez Ciebie przedziału: ");
                    for (int i = liczba2 + 1; i < liczba1; i++) {
                        if (i % 2 != 0) {              //żeby wyszły liczby nieparzyste, reszta z dzielenia musi być różna od 0
                            System.out.println(i);
                        }
                    }
                }
                break;
            default:
                System.out.println("Nie określono, czy liczba ma być parzysta czy nieparzysta.");
                break;
        }
    }
}


