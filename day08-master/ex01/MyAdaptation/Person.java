public class Person {
    private String name;
    private int age;
    private Person next;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
        this.next = null;
    }

    // person calling add can add person p to the queue
    public void add(Person p) {
        if (next == null) {
            next = p;
        } else {
            next.add(p);
        }
    }

    public String getName() {
        return name;
    }
    
    public int getAge() {
        return age;
    }
  
    public Person getNext() {
        return next;
    }
    
    public void setName(String n) {
        name = n;
    }
    
    public void setAge(int a) {
        age = a;
    }
        
    public void setNext(Person p) {
        next = p;
    }

    public String toString() {
        return "" + name + "\tage " + age;
    }
}