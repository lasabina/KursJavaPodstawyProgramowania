package kursZaawansowany.zwiazkiMiedzyKlasami.bibliotek;

public class Main {

    public static void main(String[] args) {
        Autor brzechwa = new Autor("Jan", "Brzechwa", "Bajki");
        Autor brzechwa2 = new Autor("Jan", "Brzechwa2", "Bajki");

        Ksiazka bajka1 = new Ksiazka("Zbior bajek", brzechwa);
        Ksiazka bajka2 = new Ksiazka("bajki nie dla dzieci", brzechwa2);

        Biblioteka bibliotekaMiejska = new Biblioteka(new Egzemplarz[]{bajka1, bajka2});


        for (Egzemplarz egzemplarz : bibliotekaMiejska.szukajPoTytule("bajki nie dla dzieci")) {
            System.out.println(egzemplarz);
        }


    }
}