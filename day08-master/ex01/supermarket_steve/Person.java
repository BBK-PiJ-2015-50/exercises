package week8;

public class Person {

	String name;
	int age;
	Person father;
	Person mother;
	
	public Person(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	
	public String toString(){
		return String.format("%s (%d)",name,age);
	}
	
	// getter and setters

	public String getName() {
		return name;
	}

	public int getAge() {
		return age;
	}

	public Person getFather() {
		return father;
	}

	public Person getMother() {
		return mother;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public void setFather(Person father) {
		this.father = father;
	}

	public void setMother(Person mother) {
		this.mother = mother;
	}
	

	
}
