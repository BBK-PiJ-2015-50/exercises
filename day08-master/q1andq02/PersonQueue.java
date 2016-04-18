/**
 * Created by chris on 12/26/15.
 */
public interface PersonQueue {

    /**
     * Adds another person to the queue
     */

    void insert(Person person);

    /**
     * Removes a person from the queue
     */

    Person retrieve();

}
