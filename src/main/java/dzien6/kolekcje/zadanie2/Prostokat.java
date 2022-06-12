package dzien6.kolekcje.zadanie2;

import java.util.Objects;

public class Prostokat extends Figura{

  private double bokA;
  private double bokB;

  public Prostokat(double bokA, double bokB){
    this.bokA = bokA;
    this.bokB = bokB;
  }

  @Override
  public double obliczPole(){
    return bokA * bokB;
  }

  public double getBokA(){
    return bokA;
  }

  public double getBokB(){
    return bokB;
  }

  @Override
  public boolean equals(Object o){
    if (this == o) {
      return true;
    }
    if (!(o instanceof Prostokat)) {
      return false;
    }
    Prostokat prostokat = (Prostokat) o;
    return Double.compare(prostokat.bokA, bokA) == 0
        && Double.compare(prostokat.bokB, bokB) == 0;
  }

  @Override
  public int hashCode(){
    return Objects.hash(bokA, bokB);
  }
}
