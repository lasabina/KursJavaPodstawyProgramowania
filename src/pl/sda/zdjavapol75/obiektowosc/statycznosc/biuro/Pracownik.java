package pl.sda.zdjavapol75.obiektowosc.statycznosc.biuro;

public class Pracownik {

    public static void main(String[] args) {



    }



    public int wejdzDoBiura(){
       return Biuro.liczbaOsobWewnatrz +=1;
    }
    public int wyjdzZBiura(){
       return Biuro.liczbaOsobWewnatrz -=1;
    }
    public void wykazBladIlosciPracownikow(int iloscOsobWBiurze){
        for (int i = iloscOsobWBiurze; i <=0 ; i++) {
            System.out.println("Błąd! Nie może być ujemnej ilości osób");
        }
    }
}
