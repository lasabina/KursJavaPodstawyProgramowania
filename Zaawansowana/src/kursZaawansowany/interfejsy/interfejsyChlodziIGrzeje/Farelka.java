package kursZaawansowany.interfejsy.interfejsyChlodziIGrzeje;

public class Farelka extends Urzadzenie implements IGrzeje  {

    double temperatura = 0;

    public Farelka(double temperatura) {
        super(temperatura);
    }

    @Override
    public double pobierzTemp() {
        return temperatura;
    }

    @Override
    public void zwiekszTemp() {
        temperatura += 1;
        System.out.println("W pomieszczeniu z klimatyzacją zwiększono temperaturę o 1 stopień.");
    }

    @Override
    public String toString() {
        return "Temperatura w pomieszczeniu z farelką wynosi obecnie" + temperatura + " stopni Celcjusza";
    }
}
