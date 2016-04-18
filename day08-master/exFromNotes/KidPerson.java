/**
 * Created by chris on 12/26/15.
 */
public class KidPerson implements Person {

    public void say(String message) {
        System.out.println("Kid voice: " + message);
    }

    public void move(int distance) {
        System.out.println("distance = " + distance);
    }
}