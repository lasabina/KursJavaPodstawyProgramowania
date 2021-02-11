package kursZaawansowany.zwiazkiMiedzyKlasami.bibliotek;

public class Ksiazka extends Egzemplarz{
    private String tytul;
    private Autor autor;

    public Ksiazka(String tytul, Autor autor) {
        this.tytul = tytul;
        this.autor = autor;
    }

}
