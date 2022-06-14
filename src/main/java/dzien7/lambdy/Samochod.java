package dzien7.lambdy;

import java.util.Objects;

public class Samochod implements Wypisywalny{

  private String marka;
  private String model;

  public Samochod(String marka, String model){
    this.marka = marka;
    this.model = model;
  }

  public String getMarka(){
    return marka;
  }

  public String getModel(){
    return model;
  }

  @Override
  public void wypisz(){
    System.out.println(this);
  }

  @Override
  public boolean equals(Object o){
    if (this == o) {
      return true;
    }
    if (!(o instanceof Samochod)) {
      return false;
    }
    Samochod samochod = (Samochod) o;
    return Objects.equals(marka, samochod.marka) && Objects.equals(model,
        samochod.model);
  }

  @Override
  public int hashCode(){
    return Objects.hash(marka, model);
  }

  @Override
  public String toString(){
    return "Samochod{" +
        "marka='" + marka + '\'' +
        ", model='" + model + '\'' +
        '}';
  }
}
