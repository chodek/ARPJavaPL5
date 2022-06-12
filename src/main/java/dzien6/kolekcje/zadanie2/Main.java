package dzien6.kolekcje.zadanie2;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class Main {

  public static void main(String[] args){

    Figura kwadrat1 = new Kwadrat(2);
    Figura kwadrat2 = new Kwadrat(3);
    Figura kwadrat3 = new Kwadrat(2);
    Figura prostokat1 = new Prostokat(5, 6);
    Figura prostokat2 = new Prostokat(5, 6);
    Figura prostokat3 = new Prostokat(7, 10);

    Set<Figura> figuraSet = new TreeSet<>();
    figuraSet.add(kwadrat1);
    figuraSet.add(kwadrat2);
    figuraSet.add(kwadrat3);
    figuraSet.add(prostokat1);
    figuraSet.add(prostokat2);
    figuraSet.add(prostokat3);


    // alternatywnie: sout(figuraSet);
    for (Figura figura : figuraSet) {
      System.out.println(figura);
    }


  }

}
