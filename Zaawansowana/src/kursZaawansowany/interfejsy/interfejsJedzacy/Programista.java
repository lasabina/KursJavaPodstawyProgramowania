package kursZaawansowany.interfejsy.interfejsJedzacy;

public class Programista implements IJedzacy {


    int iloscZjedzonychPosilkow = 0;
    int iloscGramowZjedzone = 0;

    @Override
    public void jedz(Pokarm pokarm) {

        System.out.println("Programista je wszystko.");
        iloscZjedzonychPosilkow += 1;
        iloscGramowZjedzone += pokarm.waga;
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
        return "Programista{" +
                "iloscZjedzonychPosilkow=" + iloscZjedzonychPosilkow +
                ", iloscGramowZjedzone=" + iloscGramowZjedzone +
                '}';
    }
}