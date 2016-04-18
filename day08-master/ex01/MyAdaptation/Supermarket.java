public class Supermarket implements PersonQueue {

	private Person head;

	public void insert(Person person) {
		if (head == null) {
			head = person;
		} else {
			head.add(person);
		}
		System.out.println(person + " has joined the queue");
	}	

	public Person retrieve() {
		if (head == null) {
			System.out.println("Queue is empty");
			return null;
		}
		Person currentHead = head;
		head = head.getNext();
		System.out.println(currentHead + " has left the queue");
		return currentHead;
	}

	// Extra methods in question, but not interface

	public void addPerson(Person p) {
		insert(p);
	}

	public Person servePerson() {
		return retrieve();
	}
}