package dzien7.interfejsy_funkcyjne;

import java.util.function.Supplier;

public class SupplierExample {

  public static void main(String[] args){

    getStringValue(() -> "cos ktos");

  }



  static void getStringValue(Supplier<String> supplier){
    System.out.println(supplier.get());
  }

}
