package pl.sda.zdjavapol75.matematyka.dzialania.odejmowanie;

public class Odejmowanie {
/*
    2.	Postępując analogicznie (do klasy dodawanie) utwórz klasy ‚pl.sda.zdjavapol75.matematyka.dzialania.odejmowanie.Odejmowanie’, ‚Mnożenie’ i ‚pl.sda.zdjavapol75.matematyka.dzialania.dzielenie.Dzielenie’
*/
    public static void main(String[] args) {

        int a, b, c;
        a = 1;
        b = 2;
        c = 3;

        System.out.println(a - 2);
        System.out.println(a - b);
        System.out.println(1 - 1);
        System.out.println(a - (b - c));
        c=a-b;
        System.out.println(c); //wyjdzie c = -1
    }
}
