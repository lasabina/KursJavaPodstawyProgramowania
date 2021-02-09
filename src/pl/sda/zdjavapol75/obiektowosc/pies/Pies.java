package pl.sda.zdjavapol75.obiektowosc.pies;

public class Pies {

        int wiek;
        String imie;
        String umaszczenie;

        public void dajGlos(){
            System.out.println("Hau hau");
        }

        public String aportuj(String kijek){
            System.out.println("Biegne biegne biegne po kijek");
            return kijek;
        }
        public void przedsawSie(String imie){
        //public void przedstawSie(){
        //    System.out.println("Jestem " + imie+" mam "+ wiek+" lat,jestem "+umaszczenie);
            System.out.println("Jestem " + this.imie+" mam "+ this.wiek+" lat,jestem "+this.umaszczenie);
        }


}
