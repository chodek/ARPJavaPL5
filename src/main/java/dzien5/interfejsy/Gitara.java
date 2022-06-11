package dzien5.interfejsy;

public class Gitara implements Muzyczny {

  int iloscStrun;



  @Override
  public int nowaMetoda(String sth){
    return 12312312;
  }

  public Gitara(int iloscStrun){
    this.iloscStrun = iloscStrun;
  }

  public void zepsujSie(){

  }

  @Override
  public void wydajDzwiek(){
    System.out.println("brzdak");
  }



}
