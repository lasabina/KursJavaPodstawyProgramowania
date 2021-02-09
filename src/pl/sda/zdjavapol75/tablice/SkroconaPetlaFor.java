package pl.sda.zdjavapol75.tablice;

public class SkroconaPetlaFor {
    public static void main(String[] args) {
/*
Zadanie, które tworzy wypisanie z tablicy metodą for i fori i dodatkowo usuwa spacje
 */

        String[] zdania = new String[]{" Ala ma kota","Bob ma psa "," Pwelma zolwia"};


        for (int i = 0; i <= zdania.length-1 ; i++) {
           zdania[i]=zdania[i].trim();
            System.out.println(zdania[i]);
        }
        System.out.println("-----------------------------------------------");

        for (String zdaniaPoprawione: zdania){
            System.out.println(zdaniaPoprawione.trim());
        }

    }
}
