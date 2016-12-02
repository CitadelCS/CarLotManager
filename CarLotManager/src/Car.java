

public class Car extends Vehicle {
  private int numPassengers;

  public Car(String s1, String s2, int y, int p) {
    super(s1, s2, y);
    numPassengers = p;
  }
  
  public int getNumPassengers(){ return numPassengers; }
  
  // override the inherited toString method but still use its functionality.
  public String toString(){
    return "Car with " + numPassengers + " seats:\n" + super.toString();
  }

}
