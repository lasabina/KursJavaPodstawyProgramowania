import java.util.Scanner;
//Witaj Sabina!;   Witaj UserName!
public class Main {
    public static void main(String[] args) {   //main albo psvm
        //sposób 1
        System.out.println("Witaj Sabina!");

        //sposób 2
        String Imię = "Sabina";
        System.out.println("Witaj"+" "+ Imię +"!");

        //sposób 3
        System.out.println("Podaj proszę swoje Imię:");
        Scanner input = new Scanner(System.in);
        String UserName = input.next();
        System.out.println("Witaj "+ UserName +"!");

    }

}
