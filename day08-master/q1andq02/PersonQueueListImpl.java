/**
 * Created by chris on 12/27/15.
 */
public class PersonQueueListImpl implements PersonQueue {
    private Person head = null;

    public PersonQueueListImpl() {
        head = null;
    }

    public void insert(Person person) {
        if (head == null) {
            head = person;
        } else {
            Person temp = head;
            while (temp.getNext() != null) {
                temp = temp.getNext();
            }
            temp.setNext(person);
        }
    }

    public Person retrieve() {
        if (head == null) {
            return null;
        }
        Person retrievedPerson = head;
        head = head.getNext();
        return retrievedPerson;
    }
}
