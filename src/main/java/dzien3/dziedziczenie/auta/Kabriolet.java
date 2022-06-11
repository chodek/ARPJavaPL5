package dzien3.dziedziczenie.auta;

public class Kabriolet extends Samochod {

  private boolean isRoofClosed;

  public Kabriolet(double predkosc, boolean isSwiatlaWlaczone, boolean isRoofClosed){
    super(predkosc, isSwiatlaWlaczone);
    this.isRoofClosed = isRoofClosed;
  }

  public void przelaczDach(){
    isRoofClosed = !isRoofClosed;
  }

  public boolean isRoofClosed(){
    return isRoofClosed;
  }

  @Override
  public void przyspiesz(){
    predkosc += 10;
    System.out.println("przyspieszam do: " + predkosc);
  }

  public void wypiszInfo(){
    System.out.println("Swiatla:" + this.isSwiatlaWlaczone);
    System.out.println("predkosc:" + this.predkosc);

  }

  @Override
  public String toString(){
    return "{predkosc=" + predkosc + ",swiatla=" + isSwiatlaWlaczone + ",dach=" + isRoofClosed
        + "}";
  }



  @Override
  public boolean equals(Object o){
    if (o instanceof Kabriolet) {
      Kabriolet other = (Kabriolet) o;
      if (this.isRoofClosed == other.isRoofClosed && this.predkosc == other.predkosc
          && this.isSwiatlaWlaczone == other.isSwiatlaWlaczone) {
        return true;
      } else {
        return false;
      }
    }
    return false;
  }


}
