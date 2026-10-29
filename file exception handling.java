import java.util.Scanner;

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter first number: ");
            String input1 = sc.nextLine();
            int num1 = Integer.parseInt(input1);

            System.out.print("Enter second number: ");
            String input2 = sc.nextLine();
            int num2 = Integer.parseInt(input2);

            int result = num1 / num2;
            System.out.println("Division result = " + result);

        } catch (ArithmeticException e) {
            System.out.println(
                "Error: Division by zero is not allowed."
            );

        } catch (NumberFormatException e) {
            System.out.println(
                "Error: Please enter valid integer numbers."
            );

        } finally {
            System.out.println("Division operation completed.");
        }

        // Demonstration of ArrayIndexOutOfBoundsException
        try {
            int[] arr = {10, 20, 30};

            System.out.println("Array element: " + arr[5]);

        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(
                "Error: Array index is out of bounds."
            );
        }

        sc.close();
    }
}