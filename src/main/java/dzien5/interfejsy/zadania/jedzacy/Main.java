package dzien5.interfejsy.zadania.jedzacy;

import java.util.Arrays;

public class Main {

  public static void main(String[] args){

    Krokodyl dandi = new Krokodyl(); // zmienna typu Klasy obiektu
    Jedzacy dandi2 = new Krokodyl(); // zmienna typu interfejsu

    // TODO analogicznie stworzyc pozostalych

    Jedzacy[] tablicaPozeraczy = new Jedzacy[]{dandi, dandi2}; // TODO dodac pozostalych


    Pokarm schabowy = new Pokarm("Schabowy", TypPokarmu.MIESO, 300);
    Pokarm jablko = new Pokarm("Jablko", TypPokarmu.OWOCE, 100);
    Pokarm[] daniaNaObiad = new Pokarm[]{schabowy, jablko};



    for (int i = 0; i < tablicaPozeraczy.length; i++) {
      for (int j = 0; j < daniaNaObiad.length; j++) {
        tablicaPozeraczy[i].jedz(daniaNaObiad[j]);
      }
    }

    // TODO znalezc zwyciwzcow pod katem ilosci posilkow oraz liczby gramow

  }

}
