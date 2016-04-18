/**
 * Created by chris on 12/27/15.
 */
public class SupermarketTest {
    public static void main(String[] args) {
        SupermarketTest script = new SupermarketTest();
        script.launch();
    }

    public void launch() {
        Supermarket waitrose = new Supermarket();
        Person servedPerson;
        Person p01 = new Person("Anna", 21);
        waitrose.addPerson(p01);
        Person p02 = new Person("Britney", 30);
        waitrose.addPerson(p02);
        Person p03 = new Person("Claire", 45);
        waitrose.addPerson(p03);
        servedPerson = waitrose.servePerson();
        System.out.println("served: " + servedPerson.getName());
        servedPerson = waitrose.servePerson();
        System.out.println("served: " + servedPerson.getName());
        Person p04 = new Person("Daisy", 19);
        waitrose.addPerson(p04);
        servedPerson = waitrose.servePerson();
        System.out.println("served: " + servedPerson.getName());
        Person p05 = new Person("Ella", 26);
        waitrose.addPerson(p05);
        servedPerson = waitrose.servePerson();
        System.out.println("served: " + servedPerson.getName());
        Person p06 = new Person("Fiona", 26);
        waitrose.addPerson(p06);
        servedPerson = waitrose.servePerson();
        System.out.println("served: " + servedPerson.getName());
        servedPerson = waitrose.servePerson();
        System.out.println("served: " + servedPerson.getName());
    }
}
