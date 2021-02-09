package pl.sda.zdjavapol75.obiektowosc.salaLekcyjna;

public class Main {
    public static void main(String[] args) {

        SalaLekcyjna salaLekcyjna1 = new SalaLekcyjna();
        salaLekcyjna1.nazwa = "matematyczna";
        salaLekcyjna1.numerSali = 130;

        SalaLekcyjna salaLekcyjna2 = new SalaLekcyjna();
        salaLekcyjna2.nazwa = "informatyczna";
        salaLekcyjna2.numerSali = 115;

        SalaLekcyjna salaLekcyjna3 = new SalaLekcyjna();
        salaLekcyjna3.nazwa = "muzyczna";
        salaLekcyjna3.numerSali = 255;

        salaLekcyjna1.wypiszDaneSali();
        salaLekcyjna2.wypiszDaneSali();
        salaLekcyjna3.wypiszDaneSali();
    }
}
