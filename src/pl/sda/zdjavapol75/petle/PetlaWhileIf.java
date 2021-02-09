package pl.sda.zdjavapol75.petle;

/*
       Petla while analogiczna do fora od 0 ddo 500, ale wyjscie z petli nastepuje z uzyciem slowka break

    */
public class PetlaWhileIf {
    public static void main(String[] args) {
        int i = 0;
        while (true) {
            System.out.println("cos");
            if (i == 500) {
                break;
            }
            i++;
        }
    }
}

