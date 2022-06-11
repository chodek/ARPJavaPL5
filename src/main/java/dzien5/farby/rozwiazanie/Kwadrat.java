package dzien5.farby.rozwiazanie;

public class Kwadrat extends Figura {

  private double bok;

  public Kwadrat(double bok){
    this.bok = bok;
  }

  @Override
  public String toString(){
    return "Kwadrat{" +
        "bok=" + bok +
        '}';
  }

  @Override
  public double obliczPole(){
    return bok * bok;
  }
}
