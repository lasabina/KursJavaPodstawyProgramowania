package pl.sda.zdjavapol75.zaawansowana.dziedziczenie.samochod;


public class Samochod {

    protected double predkosc;
    protected boolean swiatla;
    protected String kolor;
    protected String marka;
    protected int rocznik;

    public Samochod(double predkosc, boolean swiatla, String kolor, String marka, int rocznik) {
        this.predkosc = predkosc;
        this.swiatla = swiatla;
        this.kolor = kolor;
        this.marka = marka;
        this.rocznik = rocznik;
    }



    public void przyspiesz() {
        if (predkosc + 10 <= 120) {
            predkosc += 10;
            System.out.println("Przyspieszam do " + predkosc + "km/h.");
        } else {
            predkosc = 120;
            System.out.println("Osiągnięto maksymalną prędkość " + predkosc + "km/h.");
        }
    }

    protected void przelaczSwiatla() {
        swiatla = !swiatla;
        System.out.println("Zmieniono światła.");
    }

    protected boolean czySwiatlaWlaczone() {
        return swiatla;
    }
}

