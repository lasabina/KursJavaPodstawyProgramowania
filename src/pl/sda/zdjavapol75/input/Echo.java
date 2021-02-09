package pl.sda.zdjavapol75.input;

import java.util.Scanner;

public class Echo {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);   //zmienna typu skaner
        String echo = input.nextLine();
        System.out.println("Wpisałeś przed chwilą: " + echo);
    }
}
