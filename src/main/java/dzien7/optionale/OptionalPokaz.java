package dzien7.optionale;

import dzien2.enumy.Pracownik;
import java.util.Optional;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class OptionalPokaz {

  public static void main(String[] args){

    Pracownik jan = null;

    if (jan != null) {
      jan.getWiek();
    }

    Optional<String> stringOptional = Optional.empty(); // stworzenie pustego Optionala typu String

    // stringOptional = Optional.of(null); // stworzenie Optionala typu String z nulla - rzuci wyjatek

    stringOptional = Optional.ofNullable(
        null); // stworzenie Optionala typu String z nulla - wszystko ok




   /* if (stringOptional.isPresent()) {
      System.out.println("super, optional jest pelny, oto jego wartosc:");
    } else {
      System.out.println("buuuu, optional jest pusty");
    }*/

    //stringOptional.ifPresent((zawartoscOptionala) -> System.out.println(zawartoscOptionala));

    //String slowo = stringOptional.get();
    //System.out.println("slowo to: " + slowo);

    String slowo2 = stringOptional.orElse("to trafi do Optionala jesli bedzie pusty");
    System.out.println(slowo2);




    Supplier<String> supplierStringow = () -> "ala ma kota";

    String slowo = stringOptional.orElseGet(supplierStringow);
    System.out.println(slowo);

  }

}
