package dzien6.hashcode;

import java.util.Objects;

public class Student {

  private int rokUrodzenia;
  private int nrIndeksu;
  private String imie;
  private String nazwisko;

  public Student(int rokUrodzenia, int nrIndeksu, String imie, String nazwisko){
    this.rokUrodzenia = rokUrodzenia;
    this.nrIndeksu = nrIndeksu;
    this.imie = imie;
    this.nazwisko = nazwisko;
  }

  public int getRokUrodzenia(){
    return rokUrodzenia;
  }

  public int getNrIndeksu(){
    return nrIndeksu;
  }

  public String getImie(){
    return imie;
  }

  public String getNazwisko(){
    return nazwisko;
  }

  @Override
  public boolean equals(Object o){
    if (this == o) {
      return true;
    }
    if (!(o instanceof Student)) {
      return false;
    }
    Student student = (Student) o;
    return rokUrodzenia == student.rokUrodzenia && nrIndeksu == student.nrIndeksu
        && Objects.equals(imie, student.imie) && Objects.equals(nazwisko,
        student.nazwisko);
  }

  @Override
  public int hashCode(){
    return Objects.hash(rokUrodzenia, nrIndeksu, imie, nazwisko);
  }
}
