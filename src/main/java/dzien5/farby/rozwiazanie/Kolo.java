package dzien5.farby.rozwiazanie;

public class Kolo extends Figura {

  private double promien;

  public Kolo(double promien){
    this.promien = promien;
  }

  @Override
  public double obliczPole(){
    return promien * promien * Math.PI;
  }
}
