/**
 * Created by chris on 12/27/15.
 */
public class Person {
    private String name;
    private int age;
    private Person next;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        next = null;
    }

    public Person getNext() {
        return next;
    }

    public void setNext(Person person) {
        next = person;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String toString() {
        return "Name: " + name + "\tAge: " + age;
    }
}