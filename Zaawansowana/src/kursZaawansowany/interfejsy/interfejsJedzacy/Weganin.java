package kursZaawansowany.interfejsy.interfejsJedzacy;

public class Weganin implements IJedzacy {

    int iloscZjedzonychPosilkow = 0;
    int iloscGramowZjedzone = 0;

    @Override
    public void jedz(Pokarm pokarm) {
        if (pokarm.typPokarmu == TypPokarmu.OWOCE) {
            System.out.println("Weganin je " + TypPokarmu.OWOCE + ".");
            iloscZjedzonychPosilkow += 1;
            iloscGramowZjedzone += pokarm.waga;
        }
    }

    @Override
    public int ilePosilkowZjedzone() {
        return iloscZjedzonychPosilkow;
    }

    @Override
    public int ileGramowZjedzone() {
        return iloscGramowZjedzone;
    }

    @Override
    public String toString() {
        return "Weganin{" +
                "iloscZjedzonychPosilkow=" + iloscZjedzonychPosilkow +
                ", iloscGramowZjedzone=" + iloscGramowZjedzone +
                '}';
    }
}
