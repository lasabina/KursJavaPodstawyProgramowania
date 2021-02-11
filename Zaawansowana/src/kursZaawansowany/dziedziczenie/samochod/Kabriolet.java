package kursZaawansowany.dziedziczenie.samochod;

public class Kabriolet extends Samochod {

    private boolean czyDachSchowany;

    public Kabriolet(double predkosc, boolean swiatla, String kolor, String marka, int rocznik) {
        super(predkosc, swiatla, kolor, marka, rocznik);
    }


    public void schowajDach() {
        if(czyDachSchowany = false){
            System.out.println("Dach jest już schowany");
        } else {
            czyDachSchowany = true;
            System.out.println("Dach został właśnie schowany.");
        }
    }
    protected boolean czyDachSchowany() {
        return czyDachSchowany;
    }


    @Override
    public void przyspiesz() {
        if (this.predkosc + 10 <= 180) {
            predkosc += 10;
            System.out.println("Przyspieszam do " + predkosc + "km/h.");
        } else {
            predkosc = 180;
            System.out.println("Osiągnięto maksymalną prędkość " + predkosc + "km/h.");
        }
    }
}

