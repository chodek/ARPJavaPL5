package dzien4.statycznosc.metody;

public class ClassWithMethods {


  public String field;


  public static void staticMethod(String[] args){
    /* to nie zadziala:
    this.field = "asd";
    */
  }


  public void nonStaticMethod(String[] whatever){
    this.field = "asd";

  }

}
