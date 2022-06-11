package dzien2.enumy;

public enum Stanowisko {
  SZARACZEK(2),
  KIEROWNIK(3),
  WLASCICIEL(1);

  private int priorytet;

  Stanowisko(int priorytet){
    this.priorytet = priorytet;
  }

  public int getPriorytet(){
    return this.priorytet;
  }

  public static Stanowisko ustalStanowiskoNaPodstawieDoswiadczenia(int lataPracy){
    if (lataPracy < 5) {
      return Stanowisko.SZARACZEK;
    } else if (lataPracy > 5 && lataPracy < 10) {
      return KIEROWNIK;
    } else {
      return WLASCICIEL;
    }
  }
}
