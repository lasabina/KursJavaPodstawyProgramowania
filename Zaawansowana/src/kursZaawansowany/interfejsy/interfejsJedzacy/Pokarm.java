package kursZaawansowany.interfejsy.interfejsJedzacy;

public class Pokarm {

    String nazwa;
    TypPokarmu typPokarmu;
    int waga;

    public Pokarm(String nazwa, TypPokarmu typPokarmu, int waga) {
        this.nazwa = nazwa;
        this.typPokarmu = typPokarmu;
        this.waga = waga;
    }
}
