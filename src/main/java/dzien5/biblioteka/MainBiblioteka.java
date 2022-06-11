package dzien5.biblioteka;

public class MainBiblioteka {

  public static void main(String[] args){

    Autor mickiewicz = new Autor("Adam", "Mickiewicz", 200, "dramatPolskichUczniow");

    Egzemplarz ksiazka = new Ksiazka(mickiewicz, "Pan Tadeusz", 1834, "poemat epicki");

    Egzemplarz[] ksiazkiDlaBiblioteki = new Egzemplarz[]{ksiazka, ksiazka};

    Biblioteka miejska = new Biblioteka(ksiazkiDlaBiblioteki);







    // dopiero majac to wszystko zainicjalizowane i stworzone, mozemy:
    Egzemplarz[] znalezioneWBibliotece = miejska.szukajPoTytule("Pan Tadeusz");
    for (int i = 0; i < znalezioneWBibliotece.length; i++) {
      System.out.println(znalezioneWBibliotece);
    }

    miejska.szukajWielePoAutorze(mickiewicz); // okej, zadziala, zwroci 1 ksiazke
    miejska.szukajWielePoAutorze(
        new Autor("Adam", "Mickiewicz", 200, "dramatPolskichUczniow")); // to nie zadzaiala bez metody equals()


  }

}
