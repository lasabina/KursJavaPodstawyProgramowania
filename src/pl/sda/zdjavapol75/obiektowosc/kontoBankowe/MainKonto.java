package pl.sda.zdjavapol75.obiektowosc.kontoBankowe;

import pl.sda.zdjavapol75.obiektowosc.osoba.Main;
import pl.sda.zdjavapol75.obiektowosc.osoba.Osoba;

public class MainKonto {
    public static void main(String[] args) {
//        Osoba osoba1 = new Osoba("Ania", 2021 - 25, 'K');

        KontoBankowe kontoAndrzeja = new KontoBankowe(123L,1000);
        KontoBankowe kontoBeaty = new KontoBankowe(555L,2000);

        //Na konto Andrzeja wpłacamy 500 BANKOMAT
        kontoAndrzeja.wyswielStanKonta();
        kontoAndrzeja.wplacSrodki(500);
        kontoAndrzeja.wyswielStanKonta();

        //Z konta Beaty pobieramy 700 BANKOMAT
        System.out.println();
        kontoBeaty.wyswielStanKonta();
        kontoBeaty.pobierzSrodki(700);
        kontoBeaty.wyswielStanKonta();

        // PRZELEW MIĘDZY 2 KONTAMI
        System.out.println();
        kontoAndrzeja.pobierzSrodki(1000);
        kontoBeaty.wplacSrodki(1000);
        kontoBeaty.wyswielStanKonta();
        kontoAndrzeja.wyswielStanKonta();

        //PRZELEW MIEDZY 2 KONTAMI
        System.out.println();
        kontoBeaty.wplacSrodki(kontoAndrzeja.pobierzSrodki(1200));
        kontoAndrzeja.wyswielStanKonta();
        kontoBeaty.wyswielStanKonta();

        System.out.println();
        KontoBankowe kontoPuste = new KontoBankowe(999L);
        kontoPuste.wyswielStanKonta();

        System.out.println(kontoAndrzeja.getNumerKonta());



    }
}
