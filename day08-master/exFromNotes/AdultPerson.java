/**
 * Created by chris on 12/26/15.
 */
public class AdultPerson implements Person {

    public void move(int distance) {
        System.out.println("distance = " + distance);
    }

    public void say(String message) {
        System.out.println("Adult voice: " + message);
    }
}