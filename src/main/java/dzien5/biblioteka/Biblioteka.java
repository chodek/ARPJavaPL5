package dzien5.biblioteka;

public class Biblioteka {

  private Egzemplarz[] tablicaKsiazek; // kolekcja ksiazek danej biblioteki


  public Biblioteka(Egzemplarz[] tablicaKsiazek){
    this.tablicaKsiazek = tablicaKsiazek;
  }

  public Egzemplarz[] szukajWielePoTytule(String tytul){
    int licznikWystapien = 0;

    for (int i = 0; i < tablicaKsiazek.length; i++) {
      if (tablicaKsiazek[i].getTytul().equals(tytul)) {
        licznikWystapien++;
      }
    }

    Egzemplarz[] znalezione = new Egzemplarz[licznikWystapien];
    for (int i = 0; i < tablicaKsiazek.length; i++) {
      if (tablicaKsiazek[i].getTytul().equals(tytul)) {
        znalezione[licznikWystapien - 1] = tablicaKsiazek[i];
        licznikWystapien--;
      }
    }
    return znalezione;
  }

  public Egzemplarz[] szukajPoTytule(String tytul){
    // TODO: logika metody szukajacej ksiazki - wersja prostsza
    return null; // TODO <- do zmiany!
  }

  public Egzemplarz[] szukajPoAutorze(Autor szukany){
    // TODO: logika metody szukajacej ksiazki z pasujacym autorem - wersja trudniejsza
    return null; // TODO <- do zmiany!
  }

  public Egzemplarz[] szukajWielePoAutorze(Autor szukany){
    // TODO: logika metody szukajacej wszystkich ksiazek z pasujacym autorem - wersja trudniejsza
    return null; // TODO <- do zmiany!
  }
}
