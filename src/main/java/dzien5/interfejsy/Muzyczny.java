package dzien5.interfejsy;

public interface Muzyczny {

  void wydajDzwiek();

  default int nowaMetoda(String sth){
    return 0;
  }


}
