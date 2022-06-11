package dzien4.statycznosc.pola;

public class Biuro {

  public static int licznik;

  private String nazwa;


  public Biuro(String nazwa){
    this.nazwa = nazwa;
    licznik++;
  }

  public String getNazwa(){
    return nazwa;
  }

  public int getLicznik(){
    return licznik;
  }
}
