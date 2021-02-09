package pl.sda.zdjavapol75.obiektowosc.kontoBankowe;

public class Bank {

    private String nazwaBanku;
    private String[] tablicaOgloszen;
    private KontoBankowe[] kontaWBanku;

    public Bank (String nazwaBanku,KontoBankowe[] kontaWBanku){
        this.nazwaBanku =nazwaBanku;
        this.kontaWBanku =kontaWBanku;
    }

    public void wykonajPrzelew (long numerKontaZ, long numerKontaNa, int kwotaPrzelwu){

        for (int i = 0; i <kontaWBanku.length ; i++) {
            if(kontaWBanku[i].getNumerKonta() == numerKontaZ ) {
                kontaWBanku[i].pobierzSrodki(kwotaPrzelwu);
            } else if (kontaWBanku[i].getNumerKonta()==numerKontaNa){
                kontaWBanku[i].wplacSrodki(kwotaPrzelwu);
            }

        }
    }
}
