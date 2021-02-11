package kursZaawansowany.dziedziczenie.kolo;

public class MojeKolo extends Kolo {


    public MojeKolo(double promien) {
        super(promien);
    }
//Pola final nie można zmienić w klasie dziedziczącej

//Nie można nadpisać metody finalnej
//    @Override
//    final double obliczPole(){
//        double pole = pi*promien*promien;
//        return pole;
//    }

//Nie można nadpisać konstruktora
//    @Override
//    public MojeKolo() {
//    }


}
