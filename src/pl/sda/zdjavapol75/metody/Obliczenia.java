package pl.sda.zdjavapol75.metody;

public class Obliczenia {
    public static void main(String[] args) {

        System.out.println("Przed wywołaniem metody");
        System.out.println(zwocPI());
        System.out.println("Po wywołaniu metody");

        double wynikDzieleniaMetody = zwocPI();
        System.out.println(wynikDzieleniaMetody);

    }

    public static double zwocPI() {   //double, bo będzie zmienna zmiennoprzecinkowa
        double pi = 3.14;
        return pi;

    }
}

