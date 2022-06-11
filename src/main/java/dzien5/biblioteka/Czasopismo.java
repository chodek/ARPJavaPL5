package dzien5.biblioteka;

public class Czasopismo extends Egzemplarz {

  private int nrWydania;

  public Czasopismo(Autor autor, String tytul, int rokWydania, int nrWydania){
    super(autor, tytul, rokWydania);
    this.nrWydania = nrWydania;
  }

  public int getNrWydania(){
    return nrWydania;
  }

  @Override
  public String toString(){
    return "Czasopismo{" +
        "nrWydania=" + nrWydania +
        ", autor=" + autor +
        ", tytul='" + tytul + '\'' +
        ", rokWydania=" + rokWydania +
        '}';
  }
}
