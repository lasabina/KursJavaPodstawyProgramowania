package kursZaawansowany.interfejsy.interfejsInstrumantalny;

import java.lang.instrument.Instrumentation;

public class Main {
    public static void main(String[] args) {
        Beben beben = new Beben();
        Gitara gitara = new Gitara();
        Pianino pianino = new Pianino();

        beben.graj();
        gitara.graj();
        pianino.graj();

        Instumentalny[] instrumenty = new Instumentalny[]{beben, gitara, pianino};
        instrumenty[0].graj();
        instrumenty[1].graj();
        instrumenty[2].graj();

    }


}
