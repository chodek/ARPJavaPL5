package dzien5.biblioteka;

import java.util.Objects;

public abstract class Czlowiek {

  private String imie;
  private String nazwisko;
  private int wiek;

  public Czlowiek(String imie, String nazwisko, int wiek){
    this.imie = imie;
    this.nazwisko = nazwisko;
    this.wiek = wiek;
  }

  public String getImie(){
    return imie;
  }

  public String getNazwisko(){
    return nazwisko;
  }

  public int getWiek(){
    return wiek;
  }

}
