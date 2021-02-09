package pl.sda.zdjavapol75.obiektowosc.enumy.bilet;

public enum Bilet {
    ULGOWY_GODZINNY(1.50, 60),
    ULGOWY_CALODNIOWY(4.50, 1440),
    NORMALNY_GODZINNY(3, 60),
    NORMALNY_CALODNIOWY(9, 1440),
    BRAK_BILETU(0, 0);

    private double cena;
    private int czasJazdy;

    Bilet(double cena, int czasJazdy) {
        this.cena = cena;
        this.czasJazdy = czasJazdy;
    }

    public double pobierzCeneBiletu() {
        return this.cena;
    }

    public int pobierzCzasJazdy() {
        return this.czasJazdy;
    }

    public void wyswietlDaneOBilecie() {
        System.out.println("Bilet " + this.name());
    }
}
//    public static Bilet wyznaczBilet(int wiek, int czasJazdy, double kwota){
//        if(wiek<26){  //ulgowe
//            if(czasJazdy<60){  //godzinne
//                if(kwota>= ULGOWY_GODZINNY.cena){  //Czy stać kogoś na bilet
//                    return ULGOWY_GODZINNY; //jesli tak zwróc ten bilet
//            }else{
//
//            }
//        } else {
//
//        }
//
//    }
//}
