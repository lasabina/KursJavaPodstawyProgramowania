package binarySearch;

public class BinarySearch {

    public static void main(String[] args) {
        int[]tablica = new int[]{1, 3, 5, 10, 15, 20, 29, 30, 50, 102};

        System.out.println(czyWtablicyJestLiczba(tablica,5));
    }

    private static boolean czyWtablicyJestLiczba(int[] tablica, int i) {
        for (int j = 0; j <tablica.length ; j++) {
            if(tablica[j] ==i){
                return true;
            }
        }
        return false;
    }

}
