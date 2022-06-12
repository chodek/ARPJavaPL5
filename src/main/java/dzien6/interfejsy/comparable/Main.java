package dzien6.interfejsy.comparable;

import java.util.Arrays;

public class Main {

  public static void main(String[] args){


    Student jan = new Student(1990, 123456, "Jan", "Kowalski");
    Student adam = new Student(2000, 234567, "Adam", "Nowak");
    Student joanna = new Student(1980, 456789, "Joanna", "Jakies");

    Student[] studenty = new Student[]{jan, adam, joanna};
    wypiszTablice(studenty);
    System.out.println("teraz sprobuje posortowac studentow");
    Arrays.sort(studenty);
    System.out.println("Po posortowaniu:");
    wypiszTablice(studenty);


  }

  public static void wypiszTablice(Object[] tableToPrint){
    for (Object o : tableToPrint) {
      System.out.println(o);
    }
  }
}
