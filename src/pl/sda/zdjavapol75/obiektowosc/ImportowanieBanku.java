package pl.sda.zdjavapol75.obiektowosc;

import pl.sda.zdjavapol75.obiektowosc.kontoBankowe.Bank;
import pl.sda.zdjavapol75.obiektowosc.kontoBankowe.KontoBankowe;

public class ImportowanieBanku {
    public static void main(String[] args) {

        KontoBankowe[] tablicaRachunków = new KontoBankowe[3];
        tablicaRachunków[0] = new KontoBankowe(111);
        tablicaRachunków[1] = new KontoBankowe(222);
        tablicaRachunków[2] = new KontoBankowe(333);
        Bank mbank =new Bank("mbank",tablicaRachunków);


        System.out.println("Przed wykonaniem przelewu");
        System.out.println(tablicaRachunków[0].getStanKonta());
        System.out.println(tablicaRachunków[1].getStanKonta());
        System.out.println(tablicaRachunków[2].getStanKonta());

        System.out.println("Uwaga idzie przelew!");
        mbank.wykonajPrzelew(111,333,5000);

        System.out.println("Po wykonaniem przelewu");
        System.out.println(tablicaRachunków[0].getStanKonta());
        System.out.println(tablicaRachunków[1].getStanKonta());
        System.out.println(tablicaRachunków[2].getStanKonta());

    }
}
