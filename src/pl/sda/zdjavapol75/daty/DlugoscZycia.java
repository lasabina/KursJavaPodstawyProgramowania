package pl.sda.zdjavapol75.daty;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Random;
import java.util.Scanner;

/*
Napisz aplikację która po odpowiedzi użytkownika na pytania:
1) Podaj datę urodzenia w formacie: yyyy-MM-dd":
2) Kobieta, czy mężczyzna (k/m) - mężczyźni żyją średnio o 10 lat krócej
3) Czy palisz papierosy? y/n (palący żyją średnio 9 lat i 3 miesiące krócej)
4) Czy żyjesz w stresie? (jeśli tak, istnieje 10% prawdopodobieństwo, że umrzesz na zawał serca w wieku 60 lat)

Wskazówka dot. ‘prawdopodobieństwa’:

Random generator = new Random();
int losowaLiczba = generator.nextInt(100);
if (losowaLiczba < 10) {
// 10 %
}

...poda użytkownikowi przybliżoną datę śmierci. Załóż, że "startowa" długość życia to 100 lat.
Aplikacja ma podawać datę z dokładnością do miesiąca.
Możesz dodać dodatkowe warunki. Możesz użyc klasy java.time.Period
 */
public class DlugoscZycia {
    public static void main(String[] args) {


        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj date [yyyy MM dd]: ");
        String dataUrodzenia = scanner.nextLine();

        DateTimeFormatter dateFormater = DateTimeFormatter.ofPattern("yyyy MM dd");
        LocalDate podanaData = LocalDate.parse(dataUrodzenia, dateFormater);
        System.out.println(podanaData);

        LocalDate dataSmierci = podanaData.plusYears(100);
    // Kobieta/Mezczyzna
        System.out.println("Podaj plec [k/m]");
        String plec = scanner.nextLine();
        if(plec.equals("m")){
            dataSmierci = dataSmierci.minusYears(10);
        }
        System.out.println(dataSmierci);
    // pali/ nie pali

        System.out.println("Czy palisz papierosy [t/n]");
        String palenie = scanner.nextLine();
        if(palenie.equals("t")){
            dataSmierci = dataSmierci.minusYears(9).minusMonths(3);
        }
        System.out.println(dataSmierci);

    // czy żyjesz w stresie t/n

        System.out.println("Czy żyjesz w stresie [t/n]");
        String stres = scanner.nextLine();
        if(stres.equals("t")){
            Random generator = new Random();
            int losowaLiczba = generator.nextInt(100);
            if (losowaLiczba < 10){
                dataSmierci = podanaData.plusYears(60);
            }
        }
        System.out.println(dataSmierci);
    }
}