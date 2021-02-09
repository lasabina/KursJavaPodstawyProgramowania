package pl.sda.zdjavapol75.metody;

import java.util.Scanner;

public class Kalkulator2BlednyDoPoprawy {
    public static void main(String[] args) {

        wydrukujWynikKoncowy(wykonajDzialanie(pobierzLiczbe1(), pobierzLiczbe2(), okreslRodzajDzialania()),
                okreslRodzajDzialania(), pobierzLiczbe1(), pobierzLiczbe2());

//        int wynik = wykonajDzialanie(pobierzLiczbe1(),pobierzLiczbe2(),okreslRodzajDzialania());
//        wydrukujWynikKoncowy(wynik, okreslRodzajDzialania(),pobierzLiczbe1(),pobierzLiczbe2());
    }

    public static int pobierzLiczbe1() {
        System.out.println("Podaj 1 liczbę:");
        Scanner scanner = new Scanner(System.in);
        int liczba1 = scanner.nextInt();
        return liczba1;
    }

    public static int pobierzLiczbe2() {
        System.out.println("Podaj 2 liczbę:");
        Scanner scanner = new Scanner(System.in);
        int liczba2 = scanner.nextInt();
        return liczba2;
    }

    public static String okreslRodzajDzialania() {
        System.out.println("Podaj rodzaj działania: *,+,-,/:");
        Scanner scanner = new Scanner(System.in);
        String rodzaj_dzialania = scanner.nextLine();
        return rodzaj_dzialania;
    }

    public static int wykonajDzialanie(int liczba1, int liczba2, String rodzajDzialania) {
        int wynik;
        switch (rodzajDzialania) {
            case "*":
                wynik = liczba1 * liczba2;
                break;
            case "/":
                wynik = liczba1 / liczba2;
                break;
            case "+":
                wynik = liczba1 + liczba2;
                break;
            default:
                wynik = liczba1 - liczba2;
                break;
        }
        return wynik;
    }

    public static void wydrukujWynikKoncowy(int wynikKoncowy, String rodzajDzialania, int liczba1, int liczba2) {

        switch (rodzajDzialania) {
            case "*":
                System.out.println("Wynik mnożenia liczb " + liczba1 + " i " + liczba2 + " to " + wynikKoncowy + ".");
                break;
            case "/":
                System.out.println("Wynik dzielenia liczb " + liczba1 + " i " + liczba2 + " to " + wynikKoncowy + ".");
                break;
            case "+":
                System.out.println("Wynik odejmowania liczb " + liczba1 + " i " + liczba2 + " to " + wynikKoncowy + ".");
                break;
            default:
                System.out.println("Wynik odejmowania liczb " + liczba1 + " i " + liczba2 + " to " + wynikKoncowy + ".");
                break;
        }
    }
}



//    public static void wydrukujWynikKoncowy(int liczba1, int liczba2, String rodzajDzialania){
//
//        switch (rodzajDzialania) {
//            case "*":
//                System.out.println("Wynik mnożenia liczb "+liczba1+" i "+liczba2+" to "+liczba1*liczba2+".");
//                break;
//            case "/":
//                System.out.println("Wynik dzielenia liczb "+liczba1+" i "+liczba2+" to "+ liczba1/liczba2+".");
//                break;
//            case "+":
//                int suma =liczba1+liczba2;
//                System.out.println("Wynik odejmowania liczb "+liczba1+" i "+liczba2+" to "+ suma+".");
//                break;
//            default:
//                int odejmowanie =liczba1-liczba2;
//                System.out.println("Wynik odejmowania liczb "+liczba1+" i "+liczba2+" to "+ odejmowanie+".");
//                break;
//        }
//    }
//

