package dzien6.kolekcje;

import java.util.ArrayList;
import java.util.List;

public class PrzykladList {

  public static void main(String[] args){

    List<String> stringList = new ArrayList<>();

    stringList.add("ala");
    stringList.add("ma");
    stringList.add("kota");

    printList(stringList);

    //stringList.

  }

  public static void printList(List<String> listToPrint){
    System.out.println(listToPrint);
  }

}
