package pl.sda.zdjavapol75.obiektowosc.osoba;

public class Main {
    public static void main(String[] args) {

        Osoba osoba1 = new Osoba("Ania", 2021 - 25, 'K');
//        osoba1.imie ="Ania";
//        osoba1.rok_urodzenia=2021-25;


        Osoba osoba2 = new Osoba("Andrzej", 2021 - 54, 'M');
//        osoba2.imie = "Andrzej";
//        osoba2.rok_urodzenia=2021-54;


        Osoba osoba3 = new Osoba("Mariola", 2021 - 68, 'K');
//        osoba3.imie = "Mariola";
//        osoba3.rok_urodzenia=2021-68;

//        osoba1.przedstawSie();
//        osoba2.przedstawSie();
//        osoba3.przedstawSie();

        Osoba osoba4 = new Osoba("Justyna", 1978, 'K');
        Osoba osoba5 = new Osoba("Kamil", 1998, 'M');
        Osoba osoba6 = new Osoba("Jola", 2000, 'K');

//        osoba4.przedstawSie();
//        osoba5.przedstawSie();
//        osoba6.przedstawSie();

        Osoba[] tablica_osoby = new Osoba[]{osoba1, osoba2, osoba3, osoba4, osoba5, osoba6};

        System.out.println("Wypisanie wszystkich:");
        for (int i = 0; i < tablica_osoby.length; i++) {
            tablica_osoby[i].przedstawSie();
        }
        System.out.println("Wypisz tylko Panów:");
        for (int i = 0; i < tablica_osoby.length; i++) {
            if (tablica_osoby[i].plec == 'M') {
                tablica_osoby[i].przedstawSie();
            }
        }
        System.out.println("Wypisz tylko Panie:");


        for (int i = 0; i < tablica_osoby.length; i++) {
            if (tablica_osoby[i].plec == 'K') {
                tablica_osoby[i].przedstawSie();
            }
        }
    }
}



