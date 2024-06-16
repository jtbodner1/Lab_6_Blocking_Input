import java.util.Scanner;

public class FuelCosts {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double gallons = 0, efficiency = 0, pricePerGallon = 0;
        boolean done = false;

        // Input for gallons
        do {
            System.out.print("Enter the number of gallons of gas in the tank: ");
            if (in.hasNextDouble()) {
                gallons = in.nextDouble();
                in.nextLine(); // clear the buffer
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You entered: " + trash + ". Please enter a valid double value.");
            }
        } while (!done);

        // Input for fuel efficiency
        done = false;
        do {
            System.out.print("Enter the fuel efficiency in miles per gallon: ");
            if (in.hasNextDouble()) {
                efficiency = in.nextDouble();
                in.nextLine(); // clear the buffer
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You entered: " + trash + ". Please enter a valid double value.");
            }
        } while (!done);

        // Input for price per gallon
        done = false;
        do {
            System.out.print("Enter the price of gas per gallon: ");
            if (in.hasNextDouble()) {
                pricePerGallon = in.nextDouble();
                in.nextLine(); // clear the buffer
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You entered: " + trash + ". Please enter a valid double value.");
            }
        } while (!done);

        double costPer100Miles = (100 / efficiency) * pricePerGallon;
        double distance = gallons * efficiency;

        // Formatting to two decimal places
        System.out.printf("Cost per 100 miles: $%.2f\n", costPer100Miles);
        System.out.println("Distance the car can go with the gas in the tank: " + distance + " miles");
    }
}
