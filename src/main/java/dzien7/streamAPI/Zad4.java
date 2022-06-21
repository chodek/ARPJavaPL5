package dzien7.streamAPI;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Zad4 {

  public static void main(String[] args){
    List<String> someList = new ArrayList<>();
    someList.add("ala");
    someList.add("ma");
    someList.add("kota");

    System.out.println(someList);

    someList = allUpperCase(someList);

    System.out.println(someList);


  }

  public static List<String> allUpperCase(List<String> toUpper){
    return toUpper.stream()
        .map( x -> x.toUpperCase())
        .collect(Collectors.toList());
  }

}
