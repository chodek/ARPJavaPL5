package dzien5.biblioteka;

public class Ksiazka extends Egzemplarz {

  private String gatunek;

  public Ksiazka(Autor autor, String tytul, int rokWydania, String gatunek){
    super(autor, tytul, rokWydania);
    this.gatunek = gatunek;
  }

  public String getGatunek(){
    return gatunek;
  }

  @Override
  public String toString(){
    return "Ksiazka{" +
        "autor=" + autor +
        ", tytul='" + tytul + '\'' +
        ", rokWydania=" + rokWydania +
        ", gatunek='" + gatunek + '\'' +
        '}';
  }
}
