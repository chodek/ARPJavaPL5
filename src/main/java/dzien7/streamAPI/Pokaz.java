package dzien7.streamAPI;

import dzien2.enumy.Pracownik;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Pokaz {

  public static void main(String[] args){
    Pracownik swiezak = new Pracownik("Jan", "Kowalski", 2, 124);
    Pracownik janusz = new Pracownik("Janusz", "Kowalski", 15, 12);
    Pracownik areczek = new Pracownik("Arel", "Kowalski", 7, 3);
    List<Pracownik> pracownicy = new ArrayList<>(Arrays.asList(swiezak, janusz, areczek));

    pracownicy.stream(); // stream z kolekcji - 99% przypadkow
    Arrays.stream(new Pracownik[]{swiezak, janusz, areczek}); // stream z tablicy
    Stream.of(swiezak, janusz, areczek); // tworzy strumien na bazie tablic, obiektow

    List<Pracownik> filteredList = pracownicy.stream()
        .filter(pracownik -> pracownik.getStanowisko().getPriorytet() >= 2)
        .sorted(
            (pracownik1, pracownik2) -> Integer.compare(pracownik1.getWiek(), pracownik2.getWiek()))
        .collect(Collectors.toList());

    System.out.println(filteredList);

    long count = pracownicy.stream()
        .filter(pracownik -> pracownik.getStanowisko().getPriorytet() >= 2)
        .count();





    pracownicy.stream()
        .filter(pracownik -> pracownik.getStanowisko().getPriorytet() >= 2 || pracownik.getStanowisko().getPriorytet() == 0)
        .forEach(x -> System.out.println(x));


  }

}
