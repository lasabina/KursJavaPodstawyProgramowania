package pl.sda.zdjavapol75.instrukcjeWarunkowe;

public class If {
    public static void main(String[] args) {

/*
    Wyrażenie If (62slajd)
    1.	Napisać program, który sprawdza poniższe warunki i przy spełnieniu warunku wypisuje „:)”
        a.	2 > 3
        b.	4 < 5
        c.	(2 - 2) == 0
        d.	true
        e.	9%2 == 0
        f.	9%3 == 0

 */

        if (2 > 3) {
            System.out.println("a. :)");
        }
        if (4 < 5) {
            System.out.println("b. :)");
        }
        if ((2 - 2) == 0) {
            System.out.println("c. :)");
        }
        if (true) {
            System.out.println("d. :)");
        }
        if (9 % 2 == 0) {
            System.out.println("e. :)");
        }
        if (9 % 3 == 0) {
            System.out.println("f. :)");
        }

    }

}
