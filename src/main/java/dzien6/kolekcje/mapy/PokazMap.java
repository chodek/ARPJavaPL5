package dzien6.kolekcje.mapy;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class PokazMap {

  public static void main(String[] args){

    Auto audi = new Auto("GO BAMBI", "Q4", "Audi", 1990);
    Auto ford = new Auto("GWE 213", "Focus", "Ford", 2000);
    Auto porshe = new Auto("GA 1212", "Cayenne", "Porshe", 2020);

    Map<String, Auto> mapaAut = new HashMap<>();
    mapaAut.put(audi.getNrRejestracyjny(), audi);
    mapaAut.put(ford.getNrRejestracyjny(), ford);
    mapaAut.put(porshe.getNrRejestracyjny(), porshe);

    //mapaAut.
    //System.out.println(mapaAut);

    //System.out.println(mapaAut.get("Ala"));

    //System.out.println(mapaAut.values());

    Set<Entry<String,Auto>> entries = mapaAut.entrySet();

  }

}
