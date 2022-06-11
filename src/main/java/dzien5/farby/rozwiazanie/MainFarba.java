package dzien5.farby.rozwiazanie;

public class MainFarba {

  public static void main(String[] args){

    Figura kwadrat = new Kwadrat(5);
    Figura kolo = new Kolo(10);
    Figura trapez = new Trapez(1, 2, 3);

    Figura[] tablicaFigur = new Figura[]{kwadrat, kolo, trapez};

    int iloscPojemnikowZFarba = SymulatorFarby.obliczZapotrzebowanieNaFarbe(tablicaFigur, 10);

    System.out.println("Potrzebujesz: " + iloscPojemnikowZFarba + " do pomalowania tych powierzchni");
  }

}
