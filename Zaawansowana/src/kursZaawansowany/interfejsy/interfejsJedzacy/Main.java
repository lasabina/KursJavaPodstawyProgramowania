package kursZaawansowany.interfejsy.interfejsJedzacy;

public class Main {
    public static void main(String[] args) {

        Krokodyl krokodyl = new Krokodyl();
        Programista programista = new Programista();
        Weganin weganin = new Weganin();

        IJedzacy[] istotyJedzace = new IJedzacy[]{krokodyl, programista, weganin};

        for (int i = 0; i < istotyJedzace.length; i++) {
            istotyJedzace[i].jedz(new Pokarm("Sałatka", TypPokarmu.OWOCE, 10));
            istotyJedzace[i].jedz(new Pokarm("Schabowy", TypPokarmu.MIESO, 50));
            istotyJedzace[i].jedz(new Pokarm("Ser", TypPokarmu.NABIAL, 5));
        }

        int maxPosilkow = 0;
        int indeksMaxPosilkow = -1;
        for (int i = 0; i < istotyJedzace.length; i++) {
            if (istotyJedzace[i].ilePosilkowZjedzone() > maxPosilkow) {
                maxPosilkow = istotyJedzace[i].ilePosilkowZjedzone();
                indeksMaxPosilkow = i;
            }
        }
        System.out.println("Najwięcej posiłków zjadł:" + istotyJedzace[indeksMaxPosilkow] + ".");

        int maxGramow = 0;
        int indeksMaxGramow = -1;
        for (int i = 0; i < istotyJedzace.length; i++) {
            if (istotyJedzace[i].ileGramowZjedzone() > maxGramow) {
                maxGramow = istotyJedzace[i].ileGramowZjedzone();
                indeksMaxGramow = i;
            }
        }
        System.out.println("Najwięcej gramow zjadł:" + istotyJedzace[indeksMaxGramow] + ".");
    }
}
