package dzien7.lambdy;

public class KlasaPokaz {

  public static void main(String[] args){


    wypiszDanyObiekt(new Wypisywalny() {
      @Override
      public void wypisz(){

      }
    });


    // programisci to skroca do:
    wypiszDanyObiekt(() -> System.out.println("jakas wartosc"));




  }








  public static void wypiszDanyObiekt(Wypisywalny obiekt){
    obiekt.wypisz();
  }

}
