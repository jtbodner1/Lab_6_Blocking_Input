import java.util.Scanner;

public class RectangleInfo {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double width = 0, height = 0;
        boolean done = false;

        // Input for width
        do {
            System.out.print("Enter the width of the rectangle: ");
            if (in.hasNextDouble()) {
                width = in.nextDouble();
                in.nextLine(); // clear the buffer
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You entered: " + trash + ". Please enter a valid double value.");
            }
        } while (!done);

        // Input for height
        done = false;
        do {
            System.out.print("Enter the height of the rectangle: ");
            if (in.hasNextDouble()) {
                height = in.nextDouble();
                in.nextLine(); // clear the buffer
                done = true;
            } else {
                String trash = in.nextLine();
                System.out.println("You entered: " + trash + ". Please enter a valid double value.");
            }
        } while (!done);

        double area = width * height;
        double perimeter = 2 * (width + height);
        double diagonal = Math.sqrt(width * width + height * height);

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);
        System.out.println("Diagonal: " + diagonal);
    }
}
