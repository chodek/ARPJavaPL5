package dzien5.interfejsy.zadania.jedzacy;

public class Programista implements Jedzacy{

  private int zjedzonePosilki;
  private int zjedzoneGramy;

  public Programista(){
    this.zjedzonePosilki = 0;
    this.zjedzoneGramy = 0;
  }

  @Override
  public void jedz(Pokarm pokarm){
    //TODO: logika jedzenia Programisty
  }

  @Override
  public int ilePosilkowZjedzone(){
    return zjedzonePosilki;
  }

  @Override
  public int ileGramowZjedzone(){
    return zjedzoneGramy;
  }
}
