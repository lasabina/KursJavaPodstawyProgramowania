package pl.sda.zdjavapol75.obiektowosc.pies;

public class Main {
    public static void main(String[] args) {

        Pies burek = new Pies();  //utworzenie nowy obiekt, nowego psa Burek

        burek.umaszczenie = "Brązowe";
        burek.imie = "Burek";
        burek.wiek = 12;

        burek.dajGlos();
        burek.aportuj("Długi");
        burek.przedsawSie("Burek");

        System.out.println("Od teraz przemawia kolejny pies, Azor");

        Pies azor = new Pies();
        azor.umaszczenie="Czarny";
        azor.imie = "Azor";
        azor.wiek =5;
        azor.dajGlos();
        azor.aportuj("kijek");
        azor.przedsawSie("Azor");

    }
}
