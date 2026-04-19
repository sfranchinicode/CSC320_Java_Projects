import java.util.Scanner;

public class MonthlyTemperatures {
    public static void main(String[] args){

        //Create two parallel arrays to store months and temps
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };

        double[] temperatures = {
            29, 33, 44, 67, 73, 80, 99, 102, 75, 50, 43, 37
        };

        //Calculate yearly statistics
        double sum = 0;
        double max = temperatures[0];
        double min = temperatures[0];

        for (int i = 0; i < temperatures.length; i++) {
            sum += temperatures[i];
            if(temperatures[i] > max) {
                max = temperatures[i];
            }
            if(temperatures[i] < min) {
                min = temperatures[i];
            }
        }
        double average = sum / temperatures.length;
        Scanner scnr = new Scanner(System.in);

        //Loop until the user exits
        while(true) {

            System.out.print("\nEnter a month or 'year', or, 'exit' to leave: ");
            String input = scnr.nextLine();

            if(input.equalsIgnoreCase("exit")){
                System.out.println("Program ended.");
                break;
            }

            //Decision process with Ignore Case
            if(input.equalsIgnoreCase("year")) {

                //Display all months with temperatures
                for (int i = 0; i < months.length; i++) {
                    System.out.println(months[i] + ": " + temperatures[i]);
                }
            
                //Display statistics
                System.out.println("\nYearly Average: " + average);
                System.out.println("Highest Temperature: " + max);
                System.out.println("Lowest Temperature: "+ min);
            }
            else {
                //Search for the month
                boolean found = false;

                for (int i = 0; i < months.length; i++) {
                    if(months[i].equalsIgnoreCase(input)) {
                        System.out.println(months[i] + ": " + temperatures[i]);
                        found = true;
                        break; //Stop the loop once found
                    }
                }
                //Handle invalid inputs
                if(!found) {
                    System.out.println("Invalid month entered.");
                }
            }
        }
        scnr.close();
    }
}