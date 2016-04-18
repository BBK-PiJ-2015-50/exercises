import java.util.InputMismatchException;
import java.util.Scanner;

public class IntAverageWithMethod {

    public static void main(String[] args) {
        IntAverageWithMethod intAv = new IntAverageWithMethod();
        intAv.launch();
    }

    public void launch() {
        int total = 0;
        int numberOfInts = 0;
        System.out.println("PROGRAM CALCULATES AVERAGE OF LIST OF INTEGERS");
        while (numberOfInts == 0) {
            System.out.println("How many numbers would you like to enter?");
            numberOfInts = ValidInput();
        }
        for (int i=1; i<=numberOfInts; i++) {
            System.out.print("Enter number " + i + " of " + numberOfInts + " >> ");
            total+= ValidInput();
        }
        System.out.println("Integer average of the " + numberOfInts + " numbers entered = " + total/numberOfInts);
    }

    private int ValidInput() {
        while (true) {
            System.out.println("Please enter an integer");
            try {
                Scanner input = new Scanner(System.in);
                return input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Sorry - that's not an integer! Please try again");
            }
        }
    }
}