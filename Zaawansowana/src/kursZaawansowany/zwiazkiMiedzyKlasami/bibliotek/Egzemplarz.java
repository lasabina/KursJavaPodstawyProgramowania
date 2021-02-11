package kursZaawansowany.zwiazkiMiedzyKlasami.bibliotek;

public abstract class Egzemplarz {

    protected Autor autor;
    protected String tytul;

    public Autor getAutor() {
        return autor;
    }

    public String getTytul() {
        return tytul;
    }
}