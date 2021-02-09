package pl.sda.zdjavapol75.operatory;
/*
1.	Spróbuj przekonwertować następujące wartości:
A.	short - > int
B.	short -> long
C.	int -> float
D.	int -> double
E.	long -> int
F.	short -> byte
G.	char -> int

 */
public class KonwersjaTypow {
    public static void main(String[] args) {
//A
        short shortA = 10000;
        int intA = shortA;
        System.out.println("A: " + (intA));
//B
        short shortB = 10000;
        long longB = shortB;
        System.out.println("B: " + (longB));
//C
        int intC = 1255487;
        float floatC = intC;
        System.out.println("C: " + (floatC));
//D
        int intD = 15488956;
        double doubleD = intD;
        System.out.println("D: " + (doubleD));
//E
        long longE = 15648864875L;
        int intE = (int)longE;
        System.out.println("E: " + (intE));
//F
        short shortF = 18928;
        byte byteF = (byte)shortF;
        System.out.println("F: " + (byteF));
//G
        char charG ='A';
        int intG = charG;
        System.out.println("G: " + (intG));

    }
}
