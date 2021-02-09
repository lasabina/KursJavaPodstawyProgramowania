package pl.sda.zdjavapol75.instrukcjeWarunkowe;

public class SwitchInt {
    public static void main(String[] args) {
        int rozmiar = 15;
        switch (rozmiar) {
            case 10:
                System.out.println("Masz mały rozmiar");
                break;      //Brak break w tym miejscu spowoduje wykonanie wszystkich instrukcji poniżej, aż do napotkania break
            case 20:
                System.out.println("Masz średni rozmiar");
                break;
            default:
                System.out.println("Masz dziwny rozmiar");
                break;
        }
    }
}
