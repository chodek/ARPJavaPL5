package dzien4.statycznosc.metody;

public class Main {

  public static void main(String[] args){

    // tworze obiekt klasy
    ClassWithMethods cwm = new ClassWithMethods();

    // na obiekcie klasy wywoluje metode niestatyczna
    cwm.nonStaticMethod(new String[]{"asd", "wsa"});


    // odowlujac sie do klasy, mam dostep do metod statycznych (tylko i wylacznie)
    ClassWithMethods.staticMethod(new String[]{"asd", "wsa"});

  }

}
