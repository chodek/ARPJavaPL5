package dzien7.lambdy;

public class KlasaPokaz {

  public static void main(String[] args){
    wypiszDanyObiekt(new Samochod("Ford", "escort"));



    // stworzenie obiektu klasy anonimowej, sposob 1
    Wypisywalny obiketKlasaAnonimowa = new Wypisywalny() {
      @Override
      public void wypisz(){
        System.out.println("Ala ma kota!");
      }
    };

    // stworzenie obiektu klasy anonimowej, sposob 2
    Wypisywalny obiektLambda = () -> System.out.println("ala ma psa");




    //taki zapis:
    wypiszDanyObiekt(new Wypisywalny() {
                       @Override
                       public void wypisz(){
                         System.out.println("Ala ma kota!");
                       }
                     }
    );

    // programisci to skroca do:
    wypiszDanyObiekt(() -> System.out.println("ala ma psa"));


















  }


  public static void wypiszDanyObiekt(Wypisywalny obiekt){
    obiekt.wypisz();
  }

}
