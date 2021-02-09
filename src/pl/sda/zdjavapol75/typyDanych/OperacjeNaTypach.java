package pl.sda.zdjavapol75.typyDanych;

public class OperacjeNaTypach {
    public static void main(String[] args) {


        System.out.println("a. " + (2+3));
        System.out.println("b. " + (2-4));
        System.out.println("c. " + (5/2));
        System.out.println("d. 5.0/2 to: " + (5.0/2));
        System.out.println("e. 5/2.0 to: " + (5/2.0));
        System.out.println("f. 5.0/2.0 to: " + (5.0/2.0));
        System.out.println("g. 100L - 10 to: " + (100L - 10));
        System.out.println("h.  f -3 to: " + (2f -3));
        System.out.println("i. 5f/2 to: " + (5f/2));
        System.out.println("j. 5d/2 to: " + (5d/2));
        System.out.println("k. ‘A’+2 to: " + ('A'+2));
        System.out.println("l. ‘a’+2 to: " + ('a'+2));
        System.out.println("m. “a”+2 to: " + ("a"+2));
        System.out.println("n. “a”+”b” to: " + ("a"+"b"));
        System.out.println("o. ‘a’+’b’ to: " + ('a'+'b'));
        System.out.println("p. “a”+’b’ to: " + ("a"+'b'));
        System.out.println("q.  \"a\" + 'b' + 3 to: " + "a" + 'b' + 3);
        System.out.println("r. 'b' + 3 + \"a\" to: " + ('b' + 3 + "a"));
        System.out.println("s. 9%4 to: " + (9%4 ));
/*
Spróbuj wykonać działanie s bez %)
 */
        int x = 9;
        int y = 4;
        System.out.println("s2. 9%4 to: " + (x-((x/y*y))));





    }
}
