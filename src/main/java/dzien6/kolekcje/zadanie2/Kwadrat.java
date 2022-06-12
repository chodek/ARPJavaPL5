package dzien6.kolekcje.zadanie2;

import java.util.Objects;

public class Kwadrat extends Figura {
  private double bok;

  public Kwadrat(double bok){
    this.bok = bok;
  }

  @Override
  public double obliczPole(){
    return bok * bok;
  }

  public double getBok(){
    return bok;
  }

  @Override
  public boolean equals(Object o){
    if (this == o) {
      return true;
    }
    if (!(o instanceof Kwadrat)) {
      return false;
    }
    Kwadrat kwadrat = (Kwadrat) o;
    return Double.compare(kwadrat.bok, bok) == 0;
  }

  @Override
  public int hashCode(){
    return Objects.hash(bok);
  }
}
