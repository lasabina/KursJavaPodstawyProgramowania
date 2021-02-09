package pl.sda.zdjavapol75.metody;

import java.util.Scanner;

public class Kalkulator {
    public static void main(String[] args) {

        wydrukujWynikKoncowy(pobierzLiczbe1(),pobierzLiczbe2(),okreslRodzajDzialania());
        }

    public static int pobierzLiczbe1(){
        System.out.println("Podaj 1 liczbę:");
        Scanner scanner = new Scanner(System.in);
        int liczba1 =scanner.nextInt();
        return liczba1;
    }
    public static int pobierzLiczbe2(){
        System.out.println("Podaj 2 liczbę:");
        Scanner scanner = new Scanner(System.in);
        int liczba2 =scanner.nextInt();
        return liczba2;
    }
    public static String okreslRodzajDzialania(){
        System.out.println("Podaj rodzaj działania: *,+,-,/:");
        Scanner scanner = new Scanner(System.in);
        String  rodzaj_dzialania =scanner.nextLine();
        return rodzaj_dzialania;
    }

    public static void wydrukujWynikKoncowy(int liczba1, int liczba2, String rodzajDzialania){

        switch (rodzajDzialania) {
            case "*":
                System.out.println("Wynik mnożenia liczb "+liczba1+" i "+liczba2+" to "+liczba1*liczba2+".");
                break;
            case "/":
                System.out.println("Wynik dzielenia liczb "+liczba1+" i "+liczba2+" to "+ liczba1/liczba2+".");
                break;
            case "+":
                int suma =liczba1+liczba2;
                System.out.println("Wynik odejmowania liczb "+liczba1+" i "+liczba2+" to "+ suma+".");
                break;
            default:
                int odejmowanie =liczba1-liczba2;
                System.out.println("Wynik odejmowania liczb "+liczba1+" i "+liczba2+" to "+ odejmowanie+".");
                break;
        }
    }
}
