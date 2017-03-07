import java.util.Scanner;

/**
 * Created by ardydedase on 12/2/17.
 */
public class Main {
    public static void main(String[] args) {
        System.out.println("SimpleCalc");

        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number: ");
        String input1 = scanner.nextLine();
        System.out.print("Enter another number: ");
        String input2 = scanner.nextLine();

        int result = Integer.parseInt(input1) + Integer.parseInt(input2);
        System.out.println("The sum: " + result);
    }
}
