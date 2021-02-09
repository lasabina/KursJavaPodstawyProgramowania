package pl.sda.zdjavapol75.varArgs;

import java.util.Scanner;

public class kalkulator {

    public static void main(String[] args) {
        System.out.println(dodaj(4,5,6,8,1,2));
        System.out.println(odejmij(25,1,5,6,3));
    }

    public static int dodaj (int... liczbyDoDodania){
        int suma=0;
        for (int i = 0; i <liczbyDoDodania.length; i++) {
            suma += liczbyDoDodania[i];
        }
        return suma;
    }

    public static int odejmij (int... liczbyDoDodania){
        int roznica=0;
        for (int i = 0; i <liczbyDoDodania.length; i++) {
            roznica += liczbyDoDodania[i];
        }
        return roznica;
    }
}
