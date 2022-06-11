package dzien5.interfejsy.zadania.jedzacy;

public class Weganin implements Jedzacy {

  private int zjedzonePosilki;
  private int zjedzoneGramy;

  public Weganin(){
    this.zjedzonePosilki = 0;
    this.zjedzoneGramy = 0;
  }

  @Override
  public void jedz(Pokarm pokarm){
    if (pokarm.getTypPokarmu() == TypPokarmu.OWOCE) {
      System.out.println("omnomnomnom");
      zjedzonePosilki++;
      zjedzoneGramy += pokarm.getWagaPosilkuWGramach();
    } else {
      System.out.println("Jestem weganinnem, nie jem: " + pokarm.getTypPokarmu());
    }
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
