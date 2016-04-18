/**
 * Created by chris on 12/26/15.
 */
public class Brain {
    public String[] divideIntoWords(String text) {
        return text.split(" ");
    }

    public boolean isKnown(String word) {
        return false;
    }
}