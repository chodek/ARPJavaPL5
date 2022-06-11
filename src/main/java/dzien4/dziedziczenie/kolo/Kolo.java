package dzien4.dziedziczenie.kolo;

public class Kolo {

  protected final double PI = 3.14;

  protected double promien;

  public Kolo(double promien){
    this.promien = promien;
  }

  public final double obliczPole(){
    return PI * promien * promien;
  }

  // zadanie 6.3  - przeciazenie metody finalnej
  public final double obliczPole(int argument){
    return 0;
  }


  public double getPromien(){
    return promien;
  }
}
