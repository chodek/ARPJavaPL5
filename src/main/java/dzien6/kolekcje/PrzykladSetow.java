package dzien6.kolekcje;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class PrzykladSetow {

  public static void main(String[] args){

    List<String> stringList = new ArrayList<>();
    stringList.add("casda");
    stringList.add("123s");
    stringList.add("Ala");
    stringList.add("Ala");
    stringList.add("Ala");
    stringList.add("Ala");
    stringList.add("Ala");

    Set<String> stringSet = new TreeSet<>(stringList);
    stringSet.add("nowy");

    //System.out.println(stringSet);

    for (String element : stringSet) {
      System.out.println(element);
    }
  }

}
