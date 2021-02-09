package pl.sda.zdjavapol75.obiektowosc.enumy.bilet;

public class main {
    public static void main(String[] args) {

        Bilet.ULGOWY_GODZINNY.wyswietlDaneOBilecie();
        Bilet.NORMALNY_CALODNIOWY.wyswietlDaneOBilecie();

        Bilet ulogwy_calodniowy = Bilet.ULGOWY_CALODNIOWY;
        Bilet ulogwy_godzinny = Bilet.ULGOWY_GODZINNY;
        Bilet normalny_calodniowy = Bilet.NORMALNY_CALODNIOWY;
        Bilet normalny_godzinny = Bilet.NORMALNY_GODZINNY;
        Bilet brak_biletu = Bilet.BRAK_BILETU;



    }
}
