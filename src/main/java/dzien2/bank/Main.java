package dzien2.bank;

public class Main {

  public static void main(String[] args){

    KontoBankowe kontoAndrzeja = new KontoBankowe(123l, 1000);
    KontoBankowe kontoBeaty = new KontoBankowe(555l, 2000);


    System.out.println(kontoAndrzeja.getNumerKonta());


    kontoAndrzeja.wyswietlStanKonta();
    kontoBeaty.wyswietlStanKonta();


    kontoBeaty.wplacSrodki(kontoAndrzeja.pobierzSrodki(1000));

    System.out.println("Po przelewie:");
    kontoAndrzeja.wyswietlStanKonta();
    kontoBeaty.wyswietlStanKonta();

  }

}
