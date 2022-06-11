package dzien5.biblioteka;


public abstract class Egzemplarz {

  protected Autor autor;
  protected String tytul;
  protected int rokWydania;

  public Egzemplarz(Autor autor, String tytul, int rokWydania){
    this.autor = autor;
    this.tytul = tytul;
    this.rokWydania = rokWydania;
  }

  public Autor getAutor(){
    return autor;
  }

  public String getTytul(){
    return tytul;
  }

  public int getRokWydania(){
    return rokWydania;
  }

  }
