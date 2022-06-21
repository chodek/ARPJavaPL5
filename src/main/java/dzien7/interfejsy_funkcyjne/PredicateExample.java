package dzien7.interfejsy_funkcyjne;

import java.util.function.Predicate;

public class PredicateExample {

  public static void main(String[] args){
    Predicate<Integer> predicate = (value) -> {
      for (int i = value - 1; i > 1; i--) {
        if (value % i == 0) {
          return false;
        }
      }
      return true;
    };

    checkTest(predicate, 101);
    checkTest(predicate, 102);


  }


  static void checkTest(Predicate<Integer> predicate, int valueToTest){
    System.out.println(predicate.test(valueToTest));
  }

}
