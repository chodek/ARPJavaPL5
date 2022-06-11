package dzien5.interfejsy.zadania.jedzacy;

public class Pokarm {

  private String nazwa;
  private TypPokarmu typPokarmu;
  private int wagaPosilkuWGramach;

  public Pokarm(String nazwa, TypPokarmu typPokarmu, int wagaPosilkuWGramach){
    this.nazwa = nazwa;
    this.typPokarmu = typPokarmu;
    this.wagaPosilkuWGramach = wagaPosilkuWGramach;
  }

  public String getNazwa(){
    return nazwa;
  }

  public TypPokarmu getTypPokarmu(){
    return typPokarmu;
  }

  public int getWagaPosilkuWGramach(){
    return wagaPosilkuWGramach;
  }
}
