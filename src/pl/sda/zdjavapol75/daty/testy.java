package pl.sda.zdjavapol75.daty;

import java.time.LocalDate;
import java.time.Period;

public class testy {
    public static void main(String[] args) {

        System.out.println(Period.between(LocalDate.now(), LocalDate.now().plusDays(100)).getMonths());
    }
}
