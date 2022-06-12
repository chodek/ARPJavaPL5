package dzien6.kolekcje.zadanie2;

public abstract class Figura implements Comparable {

  public abstract double obliczPole();

  @Override
  public int compareTo(Object o){
    Figura other = (Figura) o;
    return (int) (this.obliczPole() - other.obliczPole());
  }

  @Override
  public String toString(){
    return "Figura{pole=" + this.obliczPole() + "}";
  }
}
