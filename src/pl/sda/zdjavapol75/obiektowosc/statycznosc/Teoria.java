package pl.sda.zdjavapol75.obiektowosc.statycznosc;

public class Teoria {

    public static void metodaStatyczna(){  //metody statyczne utworzą się przed startem
//        metodaNiestatyczna();   // metod niestatycznych nie można użyć w metodach statycznych

    }
    public void metodaNiestatyczna(){
        metodaStatyczna();     // metody statyczne można użyć w metodach statycznych
        //
    }

    public String nazwaFabryki;

}
