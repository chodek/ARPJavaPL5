package dzien2.enumy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Main {

  public static void main(String[] args){
    Pracownik swiezak = new Pracownik("Jan", "Kowalski", 2, 124);
    Pracownik janusz = new Pracownik("Janusz", "Kowalski", 15, 12);
    Pracownik areczek = new Pracownik("Arel", "Kowalski", 7, 3);

    List<Pracownik> pracownicy = new ArrayList<>(Arrays.asList(swiezak, janusz, areczek));

    for (Pracownik pracownik : pracownicy) {
      if (pracownik.getStanowisko() == Stanowisko.WLASCICIEL) {
        System.out.println("Uszanowanie wlascicielu zloty!");
      }
    }

    System.out.println(pracownicy);

    pracownicy.sort(Comparator.comparingInt(x -> x.getStanowisko().getPriorytet()));

    System.out.println("Po posortowaniu");
    System.out.println(pracownicy);

  }

}
