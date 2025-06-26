
import java.util.*;

public class Calculator {

    public static void main(String[] args) {
        int firstNum = -1;
        int secondNum = -1;
        int operation = -1;

        Scanner input = new Scanner(System.in);

        while (firstNum != 0) {

            System.out.println("Enter your first number, '0' to stop: ");
            firstNum = input.nextInt();
            if (firstNum == 0) {
                break;
            } else {
                System.out.println("Enter your second number: ");
                secondNum = input.nextInt();
                System.out.println("What method of operation?: ");
                System.out.println("Addition (1)\n Subtraction (2)\n Multiplication (3)\n Division (4)");
                operation = input.nextInt();

                if (operation == 1) {
                    int result = firstNum + secondNum;
                    System.out.println("Result: " + result);
                } else if (operation == 2) {
                    int result = firstNum - secondNum;
                    System.out.println("Result: " + result);
                } else if (operation == 3) {
                    int result = firstNum * secondNum;
                    System.out.println("Result: " + result);
                } else if (operation == 4) {
                    if (secondNum == 0) {
                        System.out.println("Undefined.");
                    } else {
                        int result = firstNum / secondNum;
                        System.out.println("Result: " + result);
                    }
                } else if (operation < 1 || operation > 4) {
                    System.out.println("Invalid method of operation. Try Again.");
                    continue;
                }
            }

        }

        input.close();

    }
}
