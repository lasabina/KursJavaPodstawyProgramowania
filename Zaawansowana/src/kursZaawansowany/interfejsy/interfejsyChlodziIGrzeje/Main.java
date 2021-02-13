package kursZaawansowany.interfejsy.interfejsyChlodziIGrzeje;

public class Main {
    public static void main(String[] args) {

        Farelka farelka = new Farelka(17);
        Wiatrak wiatrak = new Wiatrak(30);
        Klimatyzacja klimatyzacja = new Klimatyzacja(24);

        // Stworzenie tablicy urządzeń nie ma w tym przypadku sensu - nie można w tej klasie zaimlementować interfejsów
        // Igrzeje i Ichlodzi, ponieważ nie wszystkie urządzenia mają taką funkcję
        //      Urzadzenie[] tablicaUrzadzen = new Urzadzenie[]{farelka, wiatrak, klimatyzacja};


        IChlodzi[] tablicaUrzadzenChlodzacych = new IChlodzi[]{wiatrak, klimatyzacja};

        for (int i = 0; i < tablicaUrzadzenChlodzacych.length; i++) {
            for (int j = 0; j < 20; j++) {
                tablicaUrzadzenChlodzacych[i].schlodz();
//                System.out.println(tablicaUrzadzenChlodzacych[i]);
                tablicaUrzadzenChlodzacych[i].wyswietlTemp();
            }
            System.out.println("--------------");
        }

        IGrzeje[] tablicaUrzadzenGrzejacych = new IGrzeje[]{farelka, klimatyzacja};

        for (int i = 0; i < tablicaUrzadzenGrzejacych.length; i++) {
            for (int j = 0; j < 20; j++) {
                tablicaUrzadzenGrzejacych[i].zwiekszTemp();
 //               System.out.println(tablicaUrzadzenGrzejacych[i]);
                tablicaUrzadzenGrzejacych[i].wyswietlTemp();
            }
            System.out.println("--------------");
        }


    }
}
