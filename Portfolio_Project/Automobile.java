import java.io.FileWriter;
import java.io.IOException;


public class Automobile {

    // Vehicle attributes
    private String make;
    private String model;
    private String color;
    private int year;
    private int mileage;

    /*
       Default constructor
       Initialize vehicle with empty/default values
    */
    public Automobile() { 
        try {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;
        } catch (Exception e) {
            System.out.println("Error in default constructor: " + e.getMessage());
        }
    }

    /*
        Parameterized Constructor
        Return a success or failure message
    */
    public Automobile(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;
        } catch (Exception e) {
            System.out.println("Error in parameterized constructor: " + e.getMessage());
        }
    }

    /*
        Add/Sets vehicle data
        Returns success/failure message
    */
    public String addVehicle(String make, String model, String color, int year, int mileage) {
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;

            return "Vehicle added successfully.";
        } catch (Exception e) {
            return "Error adding vehicle: " + e.getMessage();
        }
    }
    
    /*
        Returns vehicle data as a string array
        Used for listing inventory information
    */
    public String[] listVehicle() { 
        try {
            return new String[] {
                this.make,
                this.model,
                this.color,
                String.valueOf(this.year),
                String.valueOf(this.mileage)
            };
        } catch (Exception e) {
            return new String[] {"Error retrieving vehicle data"};
        }
    }

    // Clears vehicle information (Remove vehicle)
    public String removeVehicle() {
        try {
            this.make = "";
            this.model = "";
            this.color = "";
            this.year = 0;
            this.mileage = 0;

            return "Vehicle removed successfully.";
        } catch (Exception e) {
            return "Error removing vehicle: " + e.getMessage();
        }
    }

    // Update vehicle attributes with new values
    public String updateVehicle(String make, String model, String color, int year, int mileage) { 
        try {
            this.make = make;
            this.model = model;
            this.color = color;
            this.year = year;
            this.mileage = mileage;

            return "Vehicle updated successfully.";
        } catch (Exception e) {
            return "Error updating vehicle: " + e.getMessage();
        }
    }

    /*
        Writes vehicle information to a text file
        Each field should be written on a new line
    */
    public String writeToFile(String filePath) {
        try (FileWriter writer = new FileWriter(filePath)) {
            String[] data = listVehicle();

            for (String item : data ) {
                writer.write(item + System.lineSeparator());
            }
            return "File written successfully to " + filePath;
        } catch (IOException e) {
            return "Error writing file: " + e.getMessage();
        }
    }
}