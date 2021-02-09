package pl.sda.zdjavapol75.obiektowosc.stosISterta.superBohater;

public class Main {
    public static void main(String[] args) {

      SuperBohater superBohater1 = new SuperBohater("Szybki","Prędkość");
      SuperBohater superBohater2 = new SuperBohater("Niewidzialny","Niewidzialność");
      SuperBohater superBohater3 = new SuperBohater("Silny","Moc");
//a.
    superBohater1=superBohater2;  //bohater1 stał się bohaterem2
    superBohater1=null;         //wyzerowano wartości bohatera1
        System.out.println(superBohater2==null); //false bohater2 ma moce.
//b.
    superBohater1=null;
    superBohater2=superBohater1; //wyzerowano bohatera2
    superBohater1=superBohater3; //bohater1 ma teraz moce bohatera3
        System.out.println(superBohater1==null); //false bo bohater1 ma moce bohatera3
        System.out.println(superBohater2==null); //true bo bohater miał moce wyzerwoane
        System.out.println(superBohater3==null); //false bo wyzerwoano moce

//5. Dodatkowe zadanie już nie z super bohaterem
        String str = "Ala";
        String str2 = new String("Ala");
        System.out.println(str.equals(str2));
        System.out.println(str==str2);   //błąd. Stringi porównujemy equals
    }




}
