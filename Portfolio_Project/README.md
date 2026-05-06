# Automobile Management System (Java)

## Overview
This project is a simple **Automobile Management System** implemented in Java. It demonstrates object-oriented programming concepts by modeling a vehicle and allowing the user to manage its data through a console-based program.
The application supports creating, updating, displaying, and saving vehicle information to a file.

## Project Structure
The program consists of two Java files:
* `Automobile.java`
  Contains the `Automobile` class with all fields and methods for managing vehicle data.

* `AutomobileInventory.java`
  Contains the main program logic, user interaction, and method calls to the `Automobile` class.

## Features
* Create a vehicle using a constructor
* Add a new vehicle
* Update vehicle details
* Remove (reset) vehicle data
* Display vehicle information
* Save vehicle data to a file
* Reusable method for printing vehicle information

## Class: Automobile

### Fields
* `make` (String)
* `model` (String)
* `color` (String)
* `year` (int)
* `mileage` (int)

### Methods
* `Automobile()`
  Initializes default values

* `Automobile(make, model, color, year, mileage)`
  Initializes a vehicle with given values

* `addVehicle(...)`
  Adds or replaces vehicle data

* `updateVehicle(...)`
  Updates existing vehicle information

* `removeVehicle()`
  Resets all fields

* `listVehicle()`
  Returns vehicle data as an array

* `writeToFile(filePath)`
  Writes vehicle data to a file

* `printVehicle(data)`
  Prints vehicle information to the console

## How to Compile and Run

### Compile
Open a terminal in the project directory and run:
javac AutomobileInventory.java Automobile.java

### Run
AutomobileInventory

## Program Flow
1. A vehicle object is created using the constructor
2. The initial vehicle data is displayed
3. The vehicle is removed (reset)
4. A new vehicle is added
5. The updated data is displayed
6. The vehicle is updated again
7. Final data is displayed
8. The user is prompted to save the data to a file
   
## File Output
* The program writes vehicle data to a text file
* The file path can be:
  * User-provided, or
  * A relative path like `Autos.txt`

This ensures compatibility across different operating systems (Windows, macOS, Linux).

## Requirements
* Java Development Kit (JDK 8 or higher)
* Command line or IDE (e.g., IntelliJ, Eclipse, VS Code)

## Example Output
Initial Vehicle:
MAKE1
MODEL1
COLOR1
1000
10

Vehicle removed successfully.

Vehicle added successfully.

After Adding Vehicle:
MAKE2
MODEL2
COLOR2
2000
20

## Future Improvements
* Support multiple vehicles using a collection (ArrayList)
* Add user input validation
* Implement a menu-driven interface
* Store and load multiple vehicles from a file

## Author
Sam Franchini
