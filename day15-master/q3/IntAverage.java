import java.util.InputMismatchException;
import java.util.Scanner;

public class IntAverage {

    public static void main(String[] args) {
        int total = 0;
        int numberOfInts = 0;
        System.out.println("PROGRAM CALCULATES AVERAGE OF LIST OF INTEGERS");
        while (numberOfInts == 0) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.println("How many numbers would you like to enter?");
                numberOfInts = input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Sorry - that's not an integer! Please try again");
            }
        }
        for (int i=1; i<=numberOfInts; i++) {
            try {
                Scanner input = new Scanner(System.in);
                System.out.print("Enter number " + i + " of " + numberOfInts + " >> ");
                total+= input.nextInt();
            } catch (InputMismatchException ex) {
                System.out.println("Sorry - that's not an integer! Please try again");
                i--;
            }
        }
        System.out.println("Integer average of the " + numberOfInts + " numbers entered = " + total/numberOfInts);
    }
}