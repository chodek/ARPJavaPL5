package dzien6.interfejsy.comparable;

public class Student implements Comparable{
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
  public String toString(){
    return "Student{" +
        "rokUrodzenia=" + rokUrodzenia +
        ", nrIndeksu=" + nrIndeksu +
        ", imie='" + imie + '\'' +
        ", nazwisko='" + nazwisko + '\'' +
        '}';
  }


  @Override
  public int compareTo(Object o){
    Student other = (Student) o;
    // return Integer.compare(this.nrIndeksu, other.nrIndeksu); // zamiennnie mozna:
    return this.nazwisko.compareTo(other.nazwisko);
  }
}
