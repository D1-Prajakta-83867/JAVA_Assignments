
import java.util.Scanner;

public class Question2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Daily Driving Cost Calculator!");

        // Input data
        System.out.print("Enter total miles driven per day: ");
        double totalMiles = scanner.nextDouble();

        System.out.print("Enter cost per gallon of gasoline: $");
        double costPerGallon = scanner.nextDouble();

        System.out.print("Enter average miles per gallon: ");
        double milesPerGallon = scanner.nextDouble();

        System.out.print("Enter parking fees per day: $");
        double parkingFees = scanner.nextDouble();

        System.out.print("Enter tolls per day: $");
        double tolls = scanner.nextDouble();

        // Calculations
        double fuelCost = (totalMiles / milesPerGallon) * costPerGallon;
        double totalCost = fuelCost + parkingFees + tolls;

        // Displaying the result
        System.out.println("\nDaily driving cost breakdown:");
        System.out.printf("Fuel cost: $%.2f%n", fuelCost);
        System.out.printf("Parking fees: $%.2f%n", parkingFees);
        System.out.printf("Tolls: $%.2f%n", tolls);
        System.out.println("--------------------------------------");
        System.out.printf("Total cost per day: $%.2f%n", totalCost);

        scanner.close();
    }
}
