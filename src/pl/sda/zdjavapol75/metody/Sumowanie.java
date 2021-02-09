package pl.sda.zdjavapol75.metody;

public class Sumowanie {


    public static void main(String[] args) {

        int wynikSumowania= sumujDwaInty(1,10);
        System.out.println(wynikSumowania);

        int wynikSumowania2= sumujDwaIntyiWyswietlNaEkranie(1,10);

    }


    public static int sumujDwaInty(int pierwszaLiczba, int drugaLiczba){
        int suma = pierwszaLiczba+drugaLiczba;
        return suma;
    }


    public static int sumujDwaIntyiWyswietlNaEkranie(int pierwszaLiczba, int drugaLiczba){
        int suma = pierwszaLiczba+drugaLiczba;
        System.out.println(suma);
        return suma;
    }
}
