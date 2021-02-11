package kursZaawansowany.interfejsy.interfejsDzwoni;

import java.util.Random;

public class Telefon implements IDzwoni{

    private String numerTelefonu;
    private int lacznyCzasRozmow;

    @Override
    public void zadzwon(String numerTelefonu) {
        Random random = new Random();
        int szansa = random.nextInt(99)+1;
        if (szansa>10){
             lacznyCzasRozmow = random.nextInt(59)+1;

            System.out.println("Dodzwoniono się. Rozmawiano: "+lacznyCzasRozmow +"minut.");
        }
        if (szansa<=10){
            System.out.println("Nie dodzwoniono się.");
        }
    }

    @Override
    public void zadzwonNaNrAlarmowy() {
    zadzwon(IDzwoni.NumerAlarmowy);
    }
}
