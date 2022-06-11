package dzien5.interfejsy.zadania.jedzacy;

public class Krokodyl implements Jedzacy {

  private int zjedzonePosilki;
  private int zjedzoneGramy;

  public Krokodyl(){
    this.zjedzonePosilki = 0;
    this.zjedzoneGramy = 0;
  }

  @Override
  public void jedz(Pokarm pokarm){
    //TODO: logika jedzenia Krokodyla
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
