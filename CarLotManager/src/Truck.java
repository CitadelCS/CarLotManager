

public class Truck extends Vehicle {
  private int towingCapacity;

  public Truck(String s1, String s2, int y, int t) {
    super(s1, s2, y);
    towingCapacity = t;
  }
  
  public int getNumPassengers(){ return towingCapacity; }
  
  // override the inherited toString method but still use its functionality.
  public String toString(){
    return "Truck with " + towingCapacity + " pounds towing capacity:\n" + super.toString();
  }

}
