package pl.sda.zdjavapol75.tablice;

import javax.sound.midi.Soundbank;

/*
Tablice – zadanie do wykonania
1.	Utwórz tablicę liczb {1,3,5,10}
2.	Wypisz z dwa elementy po indeksie
3.	Wypisz elementy w pętli
4.	Wypisz tylko liczby o parzystym indeksie
5.	Wypisz tylko liczby parzyste
6.	*Wypisz elementy w odwróconej kolejności
 */
public class Tablice {
    public static void main(String[] args) {
        System.out.println("Zadanie 1");
//Zadanie 1
        int[] liczby = new int[]{1, 3, 5, 10};
//Zadanie 2
        System.out.println("Zadanie 2");
        System.out.println(liczby[0]);
        System.out.println(liczby[3]);
//Zadanie 3
        System.out.println("Zadanie 3");
        System.out.println(liczby);    // To nie zadziała tak ładnie - nie jest poprawne

        for (int i = 0; i < liczby.length; i++) {
            System.out.println(liczby[i]);
        }

        //Inna metoda
        for (int kolejnyElementTablicy: liczby ){
            System.out.println(kolejnyElementTablicy);
        }



//Zadanie 4
        System.out.println("Zadanie 4");
        for (int i = 0; i < liczby.length; i++) {
            if (i % 2 == 0) {
                System.out.println(liczby[i]);
            }
        }
//Zadanie 5
        System.out.println("Zadanie 5");
        for (int i = 0; i < liczby.length; i++) {
            if (i % 2 == 0) {
                System.out.println(liczby[i]);
            }
        }
    }
}
