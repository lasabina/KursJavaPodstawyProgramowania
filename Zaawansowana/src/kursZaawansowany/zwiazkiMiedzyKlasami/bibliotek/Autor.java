package kursZaawansowany.zwiazkiMiedzyKlasami.bibliotek;

public class Autor extends Czlowiek{

    private String gatunek;

    public Autor(String imie, String nazwisko, String gatunek) {
        super(imie, nazwisko);
        this.gatunek = gatunek;
    }
}