package pl.sda.zdjavapol75.obiektowosc.kontoBankowe;

public class KontoBankowe {
    private long numerKonta;
    private int stanKonta;
    private int iloscWykonanychOperacji;
    private String nazwiskoWlasciciela;


    public long getNumerKonta(){
        return numerKonta;
    }

    public int getStanKonta(){
        return stanKonta;
    }

    public int getIloscWykonanychOperacji(){
        return iloscWykonanychOperacji;
    }

    public String getNazwiskoWlasciciela(){
        return nazwiskoWlasciciela;
    }

    public void setNazwiskoWlascicela(String nazwiskoWlascicela){
        this.nazwiskoWlasciciela= nazwiskoWlascicela;
    }

    public KontoBankowe (long numerKonta, int stanKonta){
        this.numerKonta =numerKonta;
        this.stanKonta = stanKonta;
        this.iloscWykonanychOperacji = 0;
    }
    //Konto nowe bez stanu konta - może mieć taką samą nazwę, bo ma inną ilość
    public KontoBankowe (long numerKonta){
        this.numerKonta =numerKonta;
        this.stanKonta = 0;
        this.iloscWykonanychOperacji = 0;
    }

    public void wyswielStanKonta(){
        System.out.println("Stan konta o numerze " +this.numerKonta +" wynosi: "+ this.stanKonta+".");
    }

    public void wplacSrodki(int kwotaDoWplacenia){
        this.stanKonta=this.stanKonta+kwotaDoWplacenia;
        System.out.println("Na konto " + this.numerKonta+" wpłacono " + kwotaDoWplacenia+".");
    }


    public int pobierzSrodki(int kwotaDoPobrania){
        this.stanKonta=this.stanKonta-kwotaDoPobrania;
        System.out.println("Z konta " +this.numerKonta+ " pobrano " + kwotaDoPobrania+".");
        return kwotaDoPobrania;
    }


}
