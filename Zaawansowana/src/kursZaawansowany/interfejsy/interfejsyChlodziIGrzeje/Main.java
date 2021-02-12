package kursZaawansowany.interfejsy.interfejsyChlodziIGrzeje;

public class Main {
    public static void main(String[] args) {

        Farelka farelka = new Farelka(17);
        Wiatrak wiatrak = new Wiatrak(30);
        Klimatyzacja klimatyzacja = new Klimatyzacja(24);

        Urzadzenie[] tablicaUrzadzen = new Urzadzenie[]{farelka, wiatrak, klimatyzacja};

        wiatrak.schlodz();
        wiatrak.pobierzTemp();

//        for (int i = 1; i <=20 ; i++) {
//            tablicaUrzadzen[i].
//        }





    }
}
