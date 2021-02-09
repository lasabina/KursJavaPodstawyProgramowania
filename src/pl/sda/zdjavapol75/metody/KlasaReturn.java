package pl.sda.zdjavapol75.metody;

import java.util.Random;

public class KlasaReturn {
    public static void main(String[] args) {

  int wylosowana  = zwrocLosowegoParzystegoInta(10,100);
        System.out.println(wylosowana);

    }

    public static int zwrocLosowego (int min, int max){
        Random random = new Random();
        return random.nextInt(max-min)+min;
    }

    public static int zwrocLosowegoParzystegoInta (int min, int max){
        Random random = new Random();
        int wylosowana = random.nextInt(max-min)+min;
        if (wylosowana%2==0){
            return wylosowana;
        }
        wylosowana = random.nextInt(max-min)+min;
        return wylosowana;
    }



//    public static int zwrocLosowegoInta (int min, int max){   /// metoda może się tak samo nazwyać, ale musi mieć inną ilość zmiennych
//        Random random = new Random();
//        return random.nextInt(max-min)+min;
//    }
}
