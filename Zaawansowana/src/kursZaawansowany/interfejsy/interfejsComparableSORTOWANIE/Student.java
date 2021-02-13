package kursZaawansowany.interfejsy.interfejsComparableSORTOWANIE;

public class Student implements Comparable<Student> {
    private String imie;
    private String nazwisko;
    private long numerAlbumu;

    public Student(String imie, String nazwisko, long numerAlbumu) {
        this.imie = imie;
        this.nazwisko = nazwisko;
        this.numerAlbumu = numerAlbumu;
    }

    public String getImie() {
        return imie;
    }

    public String getNazwisko() {
        return nazwisko;
    }

    public long getNumerAlbumu() {
        return numerAlbumu;
    }

    @Override
    public int compareTo(Student o) {

        if(this.getNumerAlbumu()< o.getNumerAlbumu()) return -1;
        if(this.getNumerAlbumu()> o.getNumerAlbumu()) return 1;
        else return 0;
    }

    @Override
    public String toString() {
        return "Imie studenta: " + imie + ". Nazwisko: " + nazwisko +". NumerAlbumu: " + numerAlbumu + ".";
    }
}
