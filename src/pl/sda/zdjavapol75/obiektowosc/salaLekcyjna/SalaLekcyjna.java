package pl.sda.zdjavapol75.obiektowosc.salaLekcyjna;

public class SalaLekcyjna {

    String nazwa;
    int numerSali;

    public void wypiszDaneSali() {
        System.out.println("Jest to klasa " + this.nazwa + ", a jej numer to " + this.numerSali + ".");
    }
}
