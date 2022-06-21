package dzien7.interfejsy_funkcyjne;

import dzien2.enumy.Pracownik;
import java.util.Arrays;
import java.util.List;
import java.util.function.Function;

public class FunctionExample {

  public static void main(String[] args){

    Function<Pracownik, Integer> pracownikNaInta = (pracownik) -> pracownik.getWiek();

    Pracownik swiezak = new Pracownik("Jan", "Kowalski", 2, 124);
    Pracownik janusz = new Pracownik("Janusz", "Kowalski", 15, 12);
    Pracownik areczek = new Pracownik("Arel", "Kowalski", 7, 3);
    List<Pracownik> pracownicy = Arrays.asList(swiezak, janusz, areczek);

    wypiszWiekPracownikow(pracownicy, pracownikNaInta);
  }


  public static void wypiszWiekPracownikow(List<Pracownik> pracownicy,
      Function<Pracownik, Integer> funkcjaZmiany){
    for (Pracownik pracownik : pracownicy) {
      System.out.println(funkcjaZmiany.apply(pracownik));
    }
  }

}
