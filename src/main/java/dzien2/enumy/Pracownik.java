package dzien2.enumy;

public class Pracownik {

  private String imie;
  private String naziwsko;
  private Stanowisko stanowisko;
  private int wiek;

  public Pracownik(String imie, String naziwsko, int lataPracy, int wiek){
    this.imie = imie;
    this.naziwsko = naziwsko;
    this.stanowisko = Stanowisko.ustalStanowiskoNaPodstawieDoswiadczenia(lataPracy);

    this.wiek = wiek;
  }

  public int getWiek(){
    return wiek;
  }

  public String getImie(){
    return imie;
  }

  public String getNaziwsko(){
    return naziwsko;
  }

  public Stanowisko getStanowisko(){
    return stanowisko;
  }

  @Override
  public String toString(){
    return "Pracownik{" +
        "imie='" + imie + '\'' +
        ", naziwsko='" + naziwsko + '\'' +
        ", stanowisko=" + stanowisko +
        '}';
  }
}
