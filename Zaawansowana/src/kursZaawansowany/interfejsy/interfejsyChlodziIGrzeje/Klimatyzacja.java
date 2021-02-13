package kursZaawansowany.interfejsy.interfejsyChlodziIGrzeje;

public class Klimatyzacja extends Urzadzenie implements IChlodzi, IGrzeje {

    double temperatura;

    @Override
    public void wyswietlTemp() {
        System.out.println("Aktualna temperatura w pomieszczeniu wynosi"+this.pobierzTemp()+" stopni Celcjusza.");
    }

    public Klimatyzacja(double temperatura) {
        super(temperatura);
    }

    @Override
    public double pobierzTemp() {
        return temperatura;
    }

    @Override
    public void schlodz() {
        temperatura -= 1;
        System.out.println("W pomieszczeniu z klimatyzacją schłodzono temperaturę o 1 stopień.");
    }

    @Override
    public void zwiekszTemp() {
        temperatura += 1;
        System.out.println("W pomieszczeniu z klimatyzacją zwiększono temperaturę o 1 stopień.");
    }

    @Override
    public String toString() {
        return "Temperatura w pomieszczeniu z klimatyzacją wynosi obecnie " + temperatura + " stopni Celcjusza";
    }
}
