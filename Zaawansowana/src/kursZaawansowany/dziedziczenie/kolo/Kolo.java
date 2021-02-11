package kursZaawansowany.dziedziczenie.kolo;

public class Kolo {

    protected final double pi = Math.PI;
    public double  promien;

    public Kolo(double promien) {
        this.promien = promien;
    }


    public final double obliczPole(){
      double pole = pi*promien*promien;
        return pole;
    }
    //przeciążenie
    public final double obliczPole(double pi){
        double pole = pi*promien*promien;
        return pole;
    }

}
