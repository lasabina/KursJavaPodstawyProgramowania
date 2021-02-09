package pl.sda.zdjavapol75.zaawansowana.dziedziczenie.samochod;

public class Main {
    public static void main(String[] args) {

        Kabriolet cabrio = new Kabriolet(40, true, "Biały", "Volvo", 1990);
        Samochod auto = new Samochod(50,false,"Różowy","Seat",2005);

        for (int i = 0; i <20 ; i++) {

            System.out.println("Auto:");
            auto.przyspiesz();
            System.out.println("Cabrio:");
            cabrio.przyspiesz();
            System.out.println("-----------");
        }
        cabrio.schowajDach();

    }
}
