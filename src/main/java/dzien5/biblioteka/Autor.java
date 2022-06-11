package dzien5.biblioteka;

import java.util.Objects;

public class Autor extends Czlowiek {

  private String gatunek;

  public Autor(String imie, String nazwisko, int wiek, String gatunek){
    super(imie, nazwisko, wiek);
    this.gatunek = gatunek;
  }

  public String getGatunek(){
    return gatunek;
  }

  @Override
  public boolean equals(Object o){
    if (this == o) {
      return true;
    }
    if (!(o instanceof Autor)) {
      return false;
    }
    if (!super.equals(o)) {
      return false;
    }
    Autor autor = (Autor) o;
    return Objects.equals(gatunek, autor.gatunek);
  }

  @Override
  public int hashCode(){
    return Objects.hash(super.hashCode(), gatunek);
  }

  @Override
  public String toString(){
    return "Autor{" +
        "gatunek='" + gatunek + '\'' +
        '}';
  }
}
