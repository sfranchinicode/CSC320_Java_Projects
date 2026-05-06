import java.util.Scanner;

public class AutomobileInventory {
    public static void main(String[] args) {
        try {
            /*
                Generic placeholder values are being used to demonstrate program 
                functionality independent of specific data. 
                This will make sure the focus remains on testing constructors, methods, 
                and object behavior rather than hardcoding values. 
            */
            Scanner scnr = new Scanner(System.in);

            // Create initial vehicle using parameterized constructor
            Automobile vehicle = new Automobile("MAKE", "MODEL", "COLOR", 0, 0);

            // Display initial vehicle information
            System.out.println("Initial Vehicle: ");
            printVehicle(vehicle.listVehicle()); 

            // Remove vehicle and reset to default values
            System.out.println("\n" + vehicle.removeVehicle());

            // Add a new vehicle using generic values
            System.out.println(vehicle.addVehicle("MAKE1", "MODEL1", "COLOR1", 1000, 10));

            // Display vehicle after adding
            System.out.println("\nAfter Adding Vehicle: ");
            printVehicle(vehicle.listVehicle());

            // Update vehicle using new generic values
            System.out.println(vehicle.updateVehicle("MAKE2", "MODEL2", "COLOR2", 2000, 20));

            // Display vehicle after update
            System.out.println("\nAfter Update:");
            printVehicle(vehicle.listVehicle());

            // File output 
            System.out.println("\nDo you want to print the information to a file? (Y/N)");
            String input = scnr.nextLine();

            if (input.equalsIgnoreCase("Y")) { 
                System.out.println(vehicle.writeToFile("Autos.txt"));
            }
            else {
                System.out.println("File will not be printed.");
            }   

            scnr.close();

        } catch (Exception e) {
            System.out.println("Error in main program: " + e.getMessage());
        }
    }

    // Method to print vehicle array and avoid repeating code
    public static void printVehicle(String[] data) {
        for (String item : data) {
            System.out.println(item);
        }
    }
}