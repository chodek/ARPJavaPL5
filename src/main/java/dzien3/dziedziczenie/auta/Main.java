package dzien3.dziedziczenie.auta;

public class Main {

  public static void main(String[] args){

    Samochod chevrolet = new Kabriolet(100, true, false);
    Samochod chevrolet2 = new Samochod(100, true);



    chevrolet.przyspiesz();
    chevrolet2.przyspiesz();



    if (chevrolet.equals(chevrolet2)) {
      System.out.println("To te same samochody!");
    } else {
      System.out.println("To sa rozne samochody!");
    }

  }

}
