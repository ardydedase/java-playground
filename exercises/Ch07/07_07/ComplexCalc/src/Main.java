import java.util.Scanner;

/**
 * Created by ardydedase on 12/2/17.
 */
public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter number: ");
        String input2 = scanner.nextLine();

        System.out.print("Enter operation: ");

        String operation = scanner.nextLine();


        try {
            double num1 = Double.parseDouble(input1);
            double num2 = Double.parseDouble(input2);
            System.out.print("Result: ");
            switch(operation) {
                case "+":
                    System.out.println(num1 + num2);
                    break;
                case "-":
                    System.out.println(num1 - num2);
                    break;
                case "*":
                    System.out.println(num1 * num2);
                    break;
                case "/":
                    System.out.println(num1 / num2);
                    break;
                default:
                    throw (new Exception("Invalid operation"));
            }
        } catch (NumberFormatException e) {
            System.out.println("Please enter a number");
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }


    }
}
