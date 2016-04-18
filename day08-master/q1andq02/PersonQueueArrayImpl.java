/**
 * Created by chris on 12/27/15.
 */
public class PersonQueueArrayImpl implements PersonQueue {

    private Person[] personArray;
    private int size;
    private static int INITIAL_ARRAY_SIZE = 5;

    public PersonQueueArrayImpl() {
        personArray = new Person[INITIAL_ARRAY_SIZE];
        size = 0;
    }

    @Override
    public void insert(Person person) {
        if (isAlmostFull()) {
            reserveMoreMemory();
        }
        personArray[size] = person;
        size++;
    }

    @Override
    public Person retrieve() {
        if (isEmpty()) {
            return null;
        }
        size--;
        Person result = personArray[0];
        for (int i=1;i<=size;i++) {
            personArray[i-1] = personArray[i];
        }
        personArray[size] = null;
        return result;
    }

    public boolean isEmpty() {
        if (size == 0) {
            return true;
        } else {
            return false;
        }
    }

    private boolean isAlmostFull() {
        if (personArray.length - size < 1) {
            return true;
        } else {
            return false;
        }
    }

    private void reserveMoreMemory() {
        Person[] biggerArray = new Person[size*2];
        for (int i = 0; i < size; i++) {
            biggerArray[i] = this.personArray[i];
        }
        this.personArray = biggerArray;
    }
}