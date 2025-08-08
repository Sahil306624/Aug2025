package pack1;

import java.util.Scanner;

public class PositiveString10 {

    public static boolean isPositiveString(String input) {
        input = input.toUpperCase();

        for (int i = 0; i < input.length() - 1; i++) {
            if (input.charAt(i) >= input.charAt(i + 1)) {
                return false; // Not strictly increasing
            }
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter a string to check if it is positive: ");
        String input = sc.next();

        boolean result = isPositiveString(input);
        System.out.println(input + " is positive: " + result);

        sc.close(); // Always good practice to close Scanner
    }
}
