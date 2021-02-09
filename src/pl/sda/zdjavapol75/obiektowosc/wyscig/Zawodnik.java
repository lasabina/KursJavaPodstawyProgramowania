package pl.sda.zdjavapol75.obiektowosc.wyscig;

import java.util.Random;

public class Zawodnik {

    String imie;
    String identyfikator;
    int predkoscminimalna;
    int predkoscmaksymalna;
    int przebiegnietekilometry;

    public Zawodnik (String imie, String identyfikator, int predkoscminimalna, int predkoscmaksymalna){
        this.imie =imie;
        this.identyfikator = identyfikator;
        this.predkoscminimalna = predkoscminimalna;
        this.predkoscmaksymalna=predkoscmaksymalna;
        this.przebiegnietekilometry =0;
    }

    public void przedstawSie(){
        System.out.println("Nazywam się "+this.imie+", mam numer "+this.identyfikator+". Biegam z prędkością "
                +this.predkoscminimalna+"km/h do "+this.predkoscmaksymalna+"km/h.");
    }

    public void biegnij(){
        Random random = new Random();
        this.przebiegnietekilometry = this.przebiegnietekilometry+random.nextInt(this.predkoscmaksymalna-this.predkoscminimalna)+this.predkoscminimalna;
        System.out.println("Zawodnik "+ this.imie +" przebiegł "+this.przebiegnietekilometry+"km.");
    }
}
