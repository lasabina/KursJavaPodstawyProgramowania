package pl.sda.zdjavapol75.instrukcjeWarunkowe;

public class If_Else {
    public static void main(String[] args) {

/*
Slajd 65
1.	Rozbuduj poprzedni program o wypisywanie „:(„ w przypadku niespełnienia warunku
a.	2 > 3
b.	4 < 5
c.	(2 - 2) == 0
d.	true
e.	9%2 == 0
f.	9%3 == 0
 */

        if (2 > 3) {
            System.out.println("a. :)");
        } else {
            System.out.println("a. :(");
        }

        if (4 < 5) {
            System.out.println("b. :)");
        } else {
            System.out.println("b. :(");
        }
        if ((2 - 2) == 0) {
            System.out.println("c. :)");
        } else {
            System.out.println("c. :(");
        }
        if (true) {
            System.out.println("d. :)");
        } else {
            System.out.println("d. :(");
        }
        if (9 % 2 == 0) {
            System.out.println("e. :)");
        } else {
            System.out.println("e. :(");
        }
        if (9 % 3 == 0) {
            System.out.println("f. :)");
        } else {
            System.out.println("f. :(");
        }

    }

}

