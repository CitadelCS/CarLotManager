

import java.util.Random;

public class Vehicle {
  protected String make;
  protected String model;
  protected int year;
  protected long VIN;

  public Vehicle(String s1, String s2, int y) {
    make = s1;
    model = s2;
    if (y > 1900 && y < 2018) year = y;
    else year = 2016;
    VIN = generateVIN();
  }

  public String getMake() {
    return make;
  }

  public String getModel() {
    return model;
  }

  public int getYear() {
    return year;
  }

  public long getVIN() {
    return VIN;
  }

  public String toString() {
    return make + " " + model + " " + year + " [VIN: " + VIN + "]";
  }

  public boolean equals(Vehicle that) {
    return this.VIN == that.VIN;
  }

  private long generateVIN() {
    Random r = new Random();
    long v = 0;
    while (v < 999999999)
      v = r.nextLong();
    return v;
  }
}
