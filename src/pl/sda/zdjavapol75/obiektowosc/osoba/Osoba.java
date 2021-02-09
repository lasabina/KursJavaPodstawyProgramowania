package pl.sda.zdjavapol75.obiektowosc.osoba;

public class Osoba {

    String imie;
    int rok_urodzenia;
    char plec;

    public Osoba (String imie, int rok_urodzenia, char plec){
        this.imie =imie;
        this.rok_urodzenia = rok_urodzenia;
        this.plec = plec;
    }


    public void przedstawSie(){
        System.out.println("Cześć! Mam na imię "+this.imie+". Rok urodzenia: "+ this.rok_urodzenia);
    }

}
