package dzien3.dziedziczenie.auta;

public class Samochod {

  protected double predkosc;
  protected boolean isSwiatlaWlaczone;

  public Samochod(double predkosc, boolean isSwiatlaWlaczone){
    this.isSwiatlaWlaczone = isSwiatlaWlaczone;
    this.predkosc = predkosc;
  }

  public void przyspiesz(){
    if (predkosc + 10 <= 120) {
      predkosc += 10;
      System.out.println("przyspieszam do: " + predkosc);
    } else{
      System.out.println("sory, szybciej nie moge!");
    }
  }

  public void przelaczSwiatla(){
    isSwiatlaWlaczone = !isSwiatlaWlaczone;
  }

  public boolean czySwiatlaWlaczone(){
    return isSwiatlaWlaczone;
  }

}
