package dzien1;

public class Osoba {

  public int rokUrodzenia;
  public String imie;



  public void przedstawSie(){
    System.out.println("Czesc! Mam na imie " + this.imie + " i mam " + (2022 - this.rokUrodzenia) + " lat.");
  }


}
