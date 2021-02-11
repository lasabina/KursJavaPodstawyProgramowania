package kursZaawansowany.interfejsy.interfejsDzwoni;

public interface IDzwoni {
    static String NumerAlarmowy ="112";

    void zadzwon(String numerTelefonu);
    void zadzwonNaNrAlarmowy();
}
