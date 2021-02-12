package kursZaawansowany.interfejsy.interfejsyChlodziIGrzeje;

public class Klimatyzacja extends Urzadzenie implements IChlodzi, IGrzeje {

    double temperatura;

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
        System.out.println("Schłodzono o 1 stopień.");
    }

    @Override
    public void zwiekszTemp() {
        temperatura += 1;
        System.out.println("Zwiększono temperaturę o 1 stopień.");
    }

    @Override
    public String toString() {
        return "Temperatura w pomieszczeniu z klimatyzacją wynosi obecnie " + temperatura + " stopni Celcjusza";
    }
}
