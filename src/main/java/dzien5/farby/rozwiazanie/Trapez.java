package dzien5.farby.rozwiazanie;

public class Trapez extends Figura {

  double podstawaDolna;
  double podstawaGorna;
  double wysokosc;

  public Trapez(double podstawaDolna, double podstawaGorna, double wysokosc){
    this.podstawaDolna = podstawaDolna;
    this.podstawaGorna = podstawaGorna;
    this.wysokosc = wysokosc;
  }

  @Override
  public double obliczPole(){
    return (podstawaDolna + podstawaGorna) / 2 * wysokosc;
  }
}
