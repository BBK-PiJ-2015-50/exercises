package week8;

public class Supermarket {
	
	Supermarket sm;
	PersonQueue queue ;
	
	public static void main(String[] args) {
		
		Supermarket sm = new Supermarket();		
		
		for (int i= 1;i<=4;i++){
			System.out.println(String.format("\n\n--- Test %d runing ---", i));
			// getQueue will get a different queue and test it against the same script in testScript
			sm.queue = sm.getQueueType(i);
			sm.testScript();
		}
	}
	
	
	private void testScript(){
		addPerson(new Person("Amy",12));
		addPerson(new Person("Bob",32));
		addPerson(new Person("Cat",45));
		addPerson(new Person("Dave",25));
		servePerson();
		servePerson();
		servePerson();
		addPerson(new Person("Emma",35));
		servePerson();
		servePerson();
		servePerson();
		addPerson(new Person("Fred",17));
		addPerson(new Person("Greg",22));
		addPerson(new Person("Harry",85));
		addPerson(new Person("Inga",25));
		addPerson(new Person("Amy",12));
		servePerson();
		servePerson();
		addPerson(new Person("Julie",76));
		addPerson(new Person("Kat",77));
		servePerson();
		servePerson();
		servePerson();		
		servePerson();
		servePerson();
		servePerson();
	}

	/**
	 * adds person to queue
	 * @param person
	 */
	public void addPerson(Person person) {
		System.out.println(String.format("Person %s has been added to the q",person.toString()));
		queue.insert(person);
	}


	/**
	 * serves a person from the queue
	 */
	public void servePerson() {
		Person person = queue.retrieve();
		if (person==null){
			System.out.println("The queue is empty");
		}else{
			
			System.out.println(String.format("Person %s has been serverd",person.toString()));			
		}

	}
	
	/**
	 * Returns new Instance of PersonQueueClass that is implementing PersonQueue interface
	 * @param choice
	 * @return
	 */
	private PersonQueue getQueueType(int choice){
		switch(choice){
		case 4:
			System.out.println("Runs an Q that is based on Arraylist using FIFO\n");
			return new ArrayPersonQueue();
		case 3:
			System.out.println("Runs an Q that is based onPerson LinkedList using FIFO\n");
			return new PointerPersonQueue();
		case 2:
			System.out.println("Runs an Q that is unfair\n");
			return new UnfairArrayPersonQueue();
		case 1:
		default:
			System.out.println("Runs an Q that is based on Person LinkedList using FIFO but will search based on age brackets <65, >64 and <18 , then >18\n");
			return new PriorityArrayPersonQueue();
		}
	}



}
