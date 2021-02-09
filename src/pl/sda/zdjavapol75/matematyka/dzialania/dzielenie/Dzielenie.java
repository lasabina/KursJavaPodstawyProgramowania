package pl.sda.zdjavapol75.matematyka.dzialania.dzielenie;

public class Dzielenie {
/*
    2.	Postępując analogicznie (do klasy dodawanie) utwórz klasy ‚pl.sda.zdjavapol75.matematyka.dzialania.odejmowanie.Odejmowanie’, ‚Mnożenie’ i ‚pl.sda.zdjavapol75.matematyka.dzialania.dzielenie.Dzielenie’
*/
    public static void main(String[] args) {

        int a, b, c;
        a = 1;
        b = 2;
        c = 3;

        System.out.println(a / 2);
        System.out.println(a / b);
        System.out.println(1 / 1);
        //System.out.println(a / (b / c));
        // 1/(2/3)  2/3 to w Java 0(bo niepełna 1), program wyrzuca błąd 1/0. Java nie dopuszcza dzielenie przez zero liczb całkowitych.
        c=a/b;
        System.out.println(c); // 1/2, to w Java 0(niepełna 1) wyjdzie c = 0
 /*
    3.	Co się stanie, jeśli podzielisz przez 0?
 */
        //Java dopuszcza jedynie dzielenie przez zero liczb zmiennoprzecinkowych.
        // Takie działanie prowadzi do dodatniej lub ujemnej nieskończoności bądź wartości nieliczebnej.
        System.out.println(1.0/0.0);    //wynikiem będzie dodatnia nieskończoność "Infinity"
        System.out.println(-1.0/0.0);   //wynikiem będzie ujemna nieskończoność "-Infinity"
        System.out.println(0.0/0.0);    //wynikiem będzie wartość nieliczebna "NaN"

    }
}
