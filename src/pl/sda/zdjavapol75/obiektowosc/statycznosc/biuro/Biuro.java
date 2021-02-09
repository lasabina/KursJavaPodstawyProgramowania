package pl.sda.zdjavapol75.obiektowosc.statycznosc.biuro;

public class Biuro {

    static int liczbaOsobWewnatrz;

    public static void main(String[] args) {
        Pracownik pracownik1 = new Pracownik();
        Pracownik pracownik2 = new Pracownik();
        Pracownik pracownik3 = new Pracownik();
        Pracownik pracownik4 = new Pracownik();
        Pracownik pracownik5 = new Pracownik();

        pracownik1.wejdzDoBiura();
        pracownik2.wyjdzZBiura();
        getLiczbaOsobWewnatrz();

    }


    public static int getLiczbaOsobWewnatrz() {
        return liczbaOsobWewnatrz;
    }

}
