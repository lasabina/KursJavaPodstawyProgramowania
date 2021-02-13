package kursZaawansowany.interfejsy.interfejsComparableSORTOWANIE;

import java.util.Arrays;
import java.util.Collections;

public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Jacek", "Nowak", 24956324);
        Student student2 = new Student("Marta", "Maślankowska", 97581476);
        Student student3 = new Student("Adam", "Nowak", 75139475);

        Student[] tabelaStudentow = new Student[]{student1, student2, student3};

        wyswietlStudentow(tabelaStudentow);
        System.out.println("\nSortowanie od najmniejszego numeru indeksu:");
        Arrays.sort(tabelaStudentow);
        wyswietlStudentow(tabelaStudentow);
        System.out.println("\nSortowanie od największego numeru indeksu:");
        Arrays.sort(tabelaStudentow, Collections.reverseOrder());
        wyswietlStudentow(tabelaStudentow);

    }

    public static void wyswietlStudentow(Student[] tabelaStudentow) {
        for (int i = 0; i < tabelaStudentow.length; i++) {
            System.out.println(tabelaStudentow[i]);
        }
    }
}