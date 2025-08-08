package pack1;

public class PositiveNegative5 {
    public static void main(String[] args) {
        // Check if a command line argument is provided
        if (args.length == 0) {
            System.out.println("Please provide a number as a command line argument.");
            return;
        }

        try {
            // Parse the first argument as an integer
            int number = Integer.parseInt(args[0]);

            // Check if the number is positive, negative, or zero
            if (number > 0) {
                System.out.println("The number is positive.");
            } else if (number < 0) {
                System.out.println("The number is negative.");
            } else {
                System.out.println("The number is zero.");
            }
        } catch (NumberFormatException e) {
            System.out.println("Invalid input. Please enter a valid integer.");
        }
    } // <-- this was missing
}
