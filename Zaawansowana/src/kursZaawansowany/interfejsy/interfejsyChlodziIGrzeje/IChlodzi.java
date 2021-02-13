package kursZaawansowany.interfejsy.interfejsyChlodziIGrzeje;

public interface IChlodzi {

    double pobierzTemp();
    void schlodz();

    default void wyswietlTemp(){
        System.out.println("Aktualna temperatura w pomieszczeniu wynosi "+this.pobierzTemp()+" stopni Celcjusza.");
    }

}
