package pl.sda.zdjavapol75.instrukcjeWarunkowe;

public class SwitchChar {
    public static void main(String[] args) {
        char symbol = '@';
        switch (symbol) {
            case '@':
                System.out.println("Masz maly rozmiar");
                break; // Brak break w tym miejscu spowoduje wykonywanie wszystkich instrukcji poniezej, az do napotkania break
            case '!':
                System.out.println("Masz sredni rozmiar");
                break;
            default:
                System.out.println("Masz dziwny rozmiar");
                break;
        }
    }
}
