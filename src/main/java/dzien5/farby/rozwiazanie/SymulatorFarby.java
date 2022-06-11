package dzien5.farby.rozwiazanie;

public class SymulatorFarby {

  public static int obliczZapotrzebowanieNaFarbe(Figura[] tablicaFigur, double wielkoscPojmenika){
    double sumaPola = 0;

    for (int i = 0; i < tablicaFigur.length; i++) {
      sumaPola = sumaPola + tablicaFigur[i].obliczPole();
    }

    double result = Math.ceil(sumaPola / wielkoscPojmenika);
    int intResult = (int) result;
    return intResult;
  }

}
