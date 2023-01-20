import java.util.Scanner; // in java util package, must be imported
public class ComputeArea {
    public static void main(String[] args) {
        // Create a Scanner object
        Scanner input = new Scanner(System.in);

        // Prompt user to input radius
        System.out.print("Enter a number for radius: ");
        double radius = input.nextDouble();

        // Compute area
        double area = radius * radius * 3.14159;

        // Display the area
        System.out.println("The area of the circle of radius " + radius + " is " + area);

    }
}