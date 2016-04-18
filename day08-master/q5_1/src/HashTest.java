/**
 * Created by chris on 12/28/15.
 */
// Test for shortHash method in HashUtilities - later tested with JUnit
import java.util.Scanner;

public class HashTest {

    public static void main(String[] args) {
        HashTest test = new HashTest();
        test.launch();
    }

    public void launch() {
        System.out.println ("Give me a string and I will calculate its hash code");
        Scanner input = new Scanner(System.in);
        String str = input.nextLine();
        int hash = str.hashCode();
        int smallHash = HashUtilities.shortHash(hash);
        System.out.println("0 < " + smallHash + " < 1000");
    }
}
