package kursZaawansowany.zwiazkiMiedzyKlasami.bibliotek;

public class Czasopismo extends Egzemplarz {

    private int numerWydania;

    public Czasopismo(Autor autor, String tytul, int numerWydania) {
        this.autor = autor;
        this.tytul = tytul;
        this.numerWydania = numerWydania;
    }


}