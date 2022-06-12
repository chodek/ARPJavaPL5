package dzien6.kolekcje.mapy;

import java.util.Objects;

public class Auto implements Comparable {

  private String nrRejestracyjny;
  private String model;
  private String marka;
  private int rokProdukcji;

  public Auto(String nrRejestracyjny, String model, String marka, int rokProdukcji){
    this.nrRejestracyjny = nrRejestracyjny;
    this.model = model;
    this.marka = marka;
    this.rokProdukcji = rokProdukcji;
  }

  @Override
  public boolean equals(Object o){
    if (this == o) {
      return true;
    }
    if (!(o instanceof Auto)) {
      return false;
    }
    Auto auto = (Auto) o;
    return rokProdukcji == auto.rokProdukcji && Objects.equals(nrRejestracyjny,
        auto.nrRejestracyjny) && Objects.equals(model, auto.model)
        && Objects.equals(marka, auto.marka);
  }

  @Override
  public int hashCode(){
    return Objects.hash(nrRejestracyjny, model, marka, rokProdukcji);
  }

  public String getNrRejestracyjny(){
    return nrRejestracyjny;
  }

  public String getModel(){
    return model;
  }

  public String getMarka(){
    return marka;
  }

  public int getRokProdukcji(){
    return rokProdukcji;
  }

  @Override
  public int compareTo(Object o){
    Auto inne = (Auto) o;
    return this.nrRejestracyjny.compareTo(inne.nrRejestracyjny);
  }

  @Override
  public String toString(){
    return "Auto{" +
        "nrRejestracyjny='" + nrRejestracyjny + '\'' +
        ", model='" + model + '\'' +
        ", marka='" + marka + '\'' +
        ", rokProdukcji=" + rokProdukcji +
        '}';
  }
}
