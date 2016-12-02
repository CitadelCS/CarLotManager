

import java.util.Scanner;

public class CarLotManager {

  // small lot initially holds four vehicles.
  private static Dealership lot = new Dealership(4);

  public static void main(String[] args) {
    char command;
    Scanner input = new Scanner(System.in);
    printMenu();
    do {
      // ask a user to choose a command
      System.out.println("\nPlease enter a command or type ?");
      command = input.nextLine().toLowerCase().charAt(0);

      switch (command) {
        case 'a': // add a vehicle
          int carOrTruck = -1;
          while (carOrTruck < 1 || carOrTruck > 2) {
            System.out.print("\nEnter 1 for Car or 2 for Truck: ");
            carOrTruck = Integer.parseInt(input.nextLine());
          }
          System.out.print("Enter make: ");
          String make = input.nextLine();
          System.out.print("Enter model: ");
          String model = input.nextLine();
          System.out.print("Enter year: ");
          int year = Integer.parseInt(input.nextLine());

          Vehicle v;
          if (carOrTruck == 1) {
            System.out.print("Enter number of passengers: ");
            int p = Integer.parseInt(input.nextLine());
            v = new Car(make, model, year, p);
          } else {
            System.out.print("Enter pounds towing capacity: ");
            int t = Integer.parseInt(input.nextLine());
            v = new Truck(make, model, year, t);
          }
          if (lot.add(v)) System.out.print("\nVehicle successfully added.\n");
          else System.out.print("Vehicle not added. No duplicates please.\n");
          break;
        case 'b': // remove a vehicle
          System.out.print("\nEnter VIN: ");
          long VIN = Long.parseLong(input.nextLine());
          if (lot.remove(lot.find(VIN))) System.out.print("\nVehicle successfully removed.\n");
          else System.out.print("Vehicle not found. Cannot remove.\n");
          break;
        case 'c': // display the vehicles
          System.out.println(lot.toString());
          break;
        case 'd': // count the vehicles
          System.out.println("\nThere are " + lot.getCount() + " vehicles in the lot");
          break;
        case '?':
          printMenu();
          break;
        case 'q':
          System.out.println("GOOD BYE!");
          break;
        default:
          System.out.println("Invalid Input");

      }

    } while (command != 'q');

    input.close();
  }



  // this method prints out the menu to a user
  // we put it here to keep the main method clean.
  public static void printMenu() {
    System.out.print("\nCar Lot Options\n" + "-----------------------------------\n"
        + "a: add a vehicle to the lot\n" + "b: remove a vehicle from the lot\n"
        + "c: display the vehicles in the lot\n" + "d: count the vehicles in the lot\n"
        + "?: display the menu again\n" + "q: quit this program\n\n");

  } // end of the printMenu method

}
