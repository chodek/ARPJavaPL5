package dzien4.statycznosc.pola;

public class BiuroMain {

  public static void main(String[] args){

    Biuro mordor = new Biuro("Mordor");
    System.out.println(mordor.getLicznik());


    Biuro obc = new Biuro("obc");
    System.out.println(obc.getLicznik());

    System.out.println("Uwaga, zmieniam wartosc statycznego pola klasy");
    Biuro.licznik = 555;

    System.out.println(obc.getLicznik());
    System.out.println(mordor.getLicznik());

  }

}
