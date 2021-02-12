package kursZaawansowany.interfejsy.interfejsyChlodziIGrzeje;

public class Wiatrak extends Urzadzenie implements IChlodzi {

    double temperatura;

    public Wiatrak(double temperatura) {
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
    public String toString() {
        return "Temperatura w pomieszczeniu z wiatrakiem wynosi obecnie" + temperatura + " stopni Celcjusza";
    }
}
