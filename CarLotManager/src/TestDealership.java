

public class TestDealership {
  public static void main(String[] args) {

    Vehicle v1 = new Vehicle("Chevy", "Suburban", 2004);
    Vehicle v2 = new Vehicle("Chevy", "Tahoe", 2005);
    Vehicle v3 = new Vehicle("Chevy", "Van", 1969);
    Vehicle v4 = new Vehicle("Tesla", "Model S", 2016);


    Dealership hendrickChevy = new Dealership(3);

    if (hendrickChevy.add(v1)) System.out.println("v1 added");
    else System.out.println("v1 not added");

    if (hendrickChevy.add(v1)) System.out.println("v1 added");
    else System.out.println("v1 not added");

    if (hendrickChevy.add(v2)) System.out.println("v2 added");
    else System.out.println("v2 not added");

    System.out.println(hendrickChevy.toString());

    if (hendrickChevy.add(v3)) System.out.println("v3 added");
    else System.out.println("v3 not added");

    if (hendrickChevy.add(v4)) System.out.println("v4 added");
    else System.out.println("v4 not added");

    if (hendrickChevy.remove(v2)) System.out.println("v2 removed");
    else System.out.println("v2 not removed");

    if (hendrickChevy.remove(v4)) System.out.println("v4 removed");
    else System.out.println("v4 not removed");

    if (hendrickChevy.add(v4)) System.out.println("v4 added");
    else System.out.println("v4 not added");

    System.out.println(hendrickChevy.toString());

  }
}
