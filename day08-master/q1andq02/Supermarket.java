/**
 * Created by chris on 12/27/15.
 */
public class Supermarket {
    private PersonQueue queue;

    public Supermarket() {
        // Choice of array or linked list implementation
        // queue = new PersonQueueArrayImpl();
        queue = new PersonQueueListImpl();
    }

    public void addPerson(Person person) {
        queue.insert(person);
    }

    public Person servePerson() {
        return queue.retrieve();
    }
}
