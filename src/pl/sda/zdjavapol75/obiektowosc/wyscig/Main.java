package pl.sda.zdjavapol75.obiektowosc.wyscig;

public class Main {
    public static void main(String[] args) {

        Zawodnik zawodnik1 = new Zawodnik("Jacek", "7#", 8, 15);
        Zawodnik zawodnik2 = new Zawodnik("Maciej", "15#", 7, 13);
        Zawodnik zawodnik3 = new Zawodnik("Piotr", "3#", 9, 14);

        zawodnik1.przedstawSie();
        zawodnik2.przedstawSie();
        zawodnik3.przedstawSie();
        System.out.println();

        while (zawodnik1.przebiegnietekilometry <= 50 && zawodnik2.przebiegnietekilometry <= 50 && zawodnik3.przebiegnietekilometry <= 50) {
            zawodnik1.biegnij();
            zawodnik2.biegnij();
            zawodnik3.biegnij();
            System.out.println();
        }
        wypiszZwyciezceBiegu(zawodnik1.przebiegnietekilometry, zawodnik1.imie, zawodnik1.identyfikator,
                zawodnik2.przebiegnietekilometry, zawodnik2.imie, zawodnik2.identyfikator,
                zawodnik3.przebiegnietekilometry, zawodnik3.imie, zawodnik3.identyfikator);


    }

    public static void wypiszZwyciezceBiegu(int kilometryZawodnika1, String imieZawodnika1, String identyfikatorZawodnika1,
                                            int kilometryZawodnika2, String imieZawodnika2, String identyfikatorZawodnika2,
                                            int kilometryZawodnika3, String imieZawodnika3, String identyfikatorZawodnika3) {

        if (kilometryZawodnika1 > kilometryZawodnika2 && kilometryZawodnika1 > kilometryZawodnika3) {
            System.out.println("Wygrał zawodnik " + imieZawodnika1 + " z numerem " + identyfikatorZawodnika1 + ". Przebiegł " + kilometryZawodnika1 + "km.");
        }
        if (kilometryZawodnika2 > kilometryZawodnika1 && kilometryZawodnika2 > kilometryZawodnika3) {
            System.out.println("Wygrał zawodnik " + imieZawodnika2 + " z numerem " + identyfikatorZawodnika2 + ". Przebiegł " + kilometryZawodnika2 + "km.");
        }
        if (kilometryZawodnika3 > kilometryZawodnika2 && kilometryZawodnika3 > kilometryZawodnika1) {
            System.out.println("Wygrał zawodnik " + imieZawodnika3 + " z numerem " + identyfikatorZawodnika3 + ". Przebiegł " + kilometryZawodnika3 + "km.");
        }
    }
}























//    public static void przeprowadzBieg() {
//        Zawodnik zawodnik1 = new Zawodnik("Jacek", "7#", 8, 15);
//        Zawodnik zawodnik2 = new Zawodnik("Maciej", "15#", 7, 13);
//        Zawodnik zawodnik3 = new Zawodnik("Piotr", "3#", 9, 14);
//
//        while (zawodnik1.przebiegnietekilometry <= 50 && zawodnik2.przebiegnietekilometry <= 50 && zawodnik3.przebiegnietekilometry <= 50) {
//            zawodnik1.biegnij();
//            zawodnik2.biegnij();
//            zawodnik3.biegnij();
//            System.out.println();
//        }
//    }
