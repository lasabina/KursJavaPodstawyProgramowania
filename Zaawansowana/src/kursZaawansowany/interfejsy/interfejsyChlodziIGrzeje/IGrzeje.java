package kursZaawansowany.interfejsy.interfejsyChlodziIGrzeje;

public interface IGrzeje {


    double pobierzTemp();
    void zwiekszTemp();

    default void wyswietlTemp(){
        System.out.println("Aktualna temperatura w pomieszczeniu wynosi "+this.pobierzTemp()+" stopni Celcjusza.");
    }

}
