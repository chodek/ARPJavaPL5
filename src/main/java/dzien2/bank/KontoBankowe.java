package dzien2.bank;

public class KontoBankowe extends Object{

  private long numerKonta;
  private int stanKonta;
  private String imie;

  protected long getNumerKonta(){
    return numerKonta;
  }

  public void setNumerKonta(long numerKonta){
    this.numerKonta = numerKonta;
  }

  public int getStanKonta(){
    return stanKonta;
  }


  public KontoBankowe(long numerKonta, int stanKonta){
    this.numerKonta = numerKonta;
    this.stanKonta = stanKonta;
  }

  public void wyswietlStanKonta(){
    System.out.println("Stan tego konta to: " + this.stanKonta);
  }

  public void wplacSrodki(int wplacanaKwota){
    this.stanKonta += wplacanaKwota;
  }

  public int pobierzSrodki(int ileWyplacic){
    this.stanKonta -= ileWyplacic;
    return ileWyplacic;
  }

}
