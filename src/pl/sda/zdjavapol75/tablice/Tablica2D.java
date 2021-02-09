package pl.sda.zdjavapol75.tablice;

public class Tablica2D {
    public static void main(String[] args) {
        // Tworzenie tablicy
        int[][] tablica2D = new int[10][10];
// pętla zewnętrzna generuje indeksy rzędów
        for (int i = 0; i < 10; i++) {
// pętla wewnętrzna generuje indeksy kolumn
            for (int j = 0; j < 10; j++) {
// możemy tak wyliczyć kolejną liczbę, ponieważ
// każdy rząd odpowiada kolejnej dziesiątce

                tablica2D[i][j] = (i + 1) * (j + 1);  //+1 żeby nie było 0 w tabliczce mnożenia
            }
        }

        //wypisywanie tablicy 2D
        for (int i = 0; i < tablica2D.length; i++) {
            //dla każdego wiersza wykonaj:
            for (int j = 0; j < tablica2D[i].length; j++) {  //ile kolumn jest w danym wierszu
                System.out.print(tablica2D[i][j] + " ");
            }
            System.out.println();
        }
    }
}
