/**
 * Created by chris on 12/27/15.
 */
public class PersonQueueArrayImplTest {
    public static void main(String[] args) {
        PersonQueueArrayImplTest script = new PersonQueueArrayImplTest();
        script.launch();
    }

    public void launch() {
        PersonQueue waitrose = new PersonQueueArrayImpl();
        Person retrievedPerson;
        Person p01 = new Person("Anna", 21);
        waitrose.insert(p01);
        Person p02 = new Person("Britney", 30);
        waitrose.insert(p02);
        Person p03 = new Person("Claire", 45);
        waitrose.insert(p03);
        retrievedPerson = waitrose.retrieve();
        System.out.println("Retrieved: " + retrievedPerson.getName());
        retrievedPerson = waitrose.retrieve();
        System.out.println("Retrieved: " + retrievedPerson.getName());
        Person p04 = new Person("Daisy", 19);
        waitrose.insert(p04);
        retrievedPerson = waitrose.retrieve();
        System.out.println("Retrieved: " + retrievedPerson.getName());
        Person p05 = new Person("Ella", 26);
        waitrose.insert(p05);
        retrievedPerson = waitrose.retrieve();
        System.out.println("Retrieved: " + retrievedPerson.getName());
        Person p06 = new Person("Fiona", 26);
        waitrose.insert(p06);
        retrievedPerson = waitrose.retrieve();
        System.out.println("Retrieved: " + retrievedPerson.getName());
        retrievedPerson = waitrose.retrieve();
        System.out.println("Retrieved: " + retrievedPerson.getName());
    }
}
