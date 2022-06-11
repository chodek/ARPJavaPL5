package dzien2.ulamki;

public class Ulamek {

  private int licznik;
  private int mianownik;

  public Ulamek(){
    licznik = 0;
    mianownik = 0;
  }

  public Ulamek(int licznik, int mianownik){
    this.licznik = licznik;
    this.mianownik = mianownik;
  }

  public void pomnozPrzez(Ulamek inny){
    // 3/4 * 5/6 = (3*5)/(4*6)
    this.licznik *= inny.licznik;
    this.mianownik *= inny.mianownik;
  }

  /*
  TODO: dzielenie, dodawanie, odejmowanie
   */

  public void wypisz(){
    System.out.println(licznik + "/" + mianownik);
  }
}
