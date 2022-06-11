package dzien4.abstrakcja;

public abstract class SomeClass {

  private int size;


  public abstract void someAbstractMethod();

  public SomeClass(int size){
    this.size = size;
  }

  public int getSize(){
    return size;
  }
}
