package pl.sda.zdjavapol75.stringi;

import java.util.Locale;

public class Main {
    public static void main(String[] args) {

    //Przykład 1:
        String slowo = "AAAAAAAAla";
        System.out.println(slowo.replace("AAA","a"));

    //Przykład 2:
        String slowo2 =" Hello World! ";
        // trim-usuwa przerwy przerwy, replace-zamienia słowo na inne, toLowerCase-zmniejsza na mniejsze
        String zmienioneSlowo2 = slowo2.trim().replace("World","You").toLowerCase();
        System.out.println(zmienioneSlowo2);
    //Przykład3:  StringBuilder nie spowoduje powstanie kolejnych Stringów - jest bardzo wydajny

        String slowo3=" Hello World ";
        slowo3=slowo3.trim();                   //"Hello World"
        slowo3=slowo3.toUpperCase();            //"HELLO WORLD"
        slowo3=slowo3.replace("WORLD","Poland");       //"HELLO Poland"

        StringBuilder sb = new StringBuilder("Hello World");
        sb.trimToSize();
        sb.reverse();
        slowo3 = sb.toString();
        System.out.println(slowo3);

    }
}
