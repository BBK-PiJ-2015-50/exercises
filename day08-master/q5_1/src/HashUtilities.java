/**
 * Created by chris on 12/28/15.
 */
public class HashUtilities {

    public static int shortHash(int number) {
        return Math.abs(number%1000);
    }
}
