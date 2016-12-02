

public class Dealership {

  private Vehicle[] inventory;
  private int count;

  public Dealership(int size) {
    inventory = new Vehicle[size];
    count = 0;
  }

  private int indexOf(Vehicle v) {
    for (int i = 0; i < count; i++) {
      if (inventory[i].equals(v)) return i;
    }
    return -1;
  }

  public boolean contains(Vehicle v) {
    if (indexOf(v) != -1) return true;
    else return false;
    // return (indexOf(v) != -1);
  }

  public Vehicle find(long VIN) {
    for (int i = 0; i < count; i++)
      if (inventory[i].getVIN() == VIN) return inventory[i];
    return null;
  }

  public boolean add(Vehicle v) {
    // are we full?
    if (count >= inventory.length) return false;
    // are you a dup?
    if (contains(v)) return false;
    // ok let's add you
    inventory[count] = v;
    count++;
    return true;
  }

  public int getCount() {
    return count;
  }

  public boolean remove(Vehicle v) {

    if (!contains(v)) return false;
    int loc = indexOf(v);

    inventory[loc] = inventory[count - 1];
    inventory[count - 1] = null;
    count--;
    return true;
  }

  public String toString() {
    StringBuilder sb = new StringBuilder();
    for (int i = 0; i < count; i++) {
      sb.append(inventory[i].toString());
      sb.append("\n******************\n");
    }
    return sb.toString();
  }

}
