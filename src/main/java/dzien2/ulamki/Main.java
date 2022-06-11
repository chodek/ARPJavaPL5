package dzien2.ulamki;

public class Main {

  public static void main(String[] args){
    Ulamek pierwszy = new Ulamek(1, 2);
    Ulamek drugi = new Ulamek(3, 4);

    pierwszy.wypisz();

    pierwszy.pomnozPrzez(drugi);

    pierwszy.wypisz();



    pierwszy.pomnozPrzez(drugi);




  }

}
