/**
 * Created by chris on 12/27/15.
 */
/**
 * Created by chris on 12/27/15.
 */
public class PersonQueueListImplTest {
    public static void main(String[] args) {
        PersonQueueListImplTest script = new PersonQueueListImplTest();
        script.launch();
    }

    public void launch() {
        PersonQueue waitrose = new PersonQueueListImpl();
        Person retrievedPerson;
        Person p01 = new Person("Anna", 21);
        waitrose.insert(p01);
        Person p02 = new Person("Britney", 30);
        waitrose.insert(p02);
        Person p03 = new Person("Claire", 45);
        waitrose.insert(p03);
        retrievedPerson = waitrose.retrieve();
        System.out.println("Retrieved: " + retrievedPerson.getName()
                + ", " + retrievedPerson.getAge());
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
        Person p07 = new Person("Gill", 38);
        waitrose.insert(p07);
        retrievedPerson = waitrose.retrieve();
        System.out.println("Retrieved: " + retrievedPerson.getName());
        retrievedPerson = waitrose.retrieve();
        System.out.println("Retrieved: " + retrievedPerson.getName());
        retrievedPerson = waitrose.retrieve();
        System.out.println("Retrieved: " + retrievedPerson.getName());
        Person p08 = new Person("Harriet", 51);
        waitrose.insert(p08);
        Person p09 = new Person("Isobel", 17);
        waitrose.insert(p09);
        Person p10 = new Person("Jules", 42);
        waitrose.insert(p10);
        retrievedPerson = waitrose.retrieve();
        System.out.println("Retrieved: " + retrievedPerson.getName());
        retrievedPerson = waitrose.retrieve();
        System.out.println("Retrieved: " + retrievedPerson.getName());
        retrievedPerson = waitrose.retrieve();
        System.out.println("Retrieved: " + retrievedPerson.getName());
    }
}
