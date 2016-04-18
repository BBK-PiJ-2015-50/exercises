public class QueueScript {
	
	public static void main(String[] args) {
		QueueScript script = new QueueScript();
		script.launch();
	}

	private void launch() {

		PersonQueue market = new Supermarket();
		// testing personQueue interface methods: insert() & retrieve()

		Person p1 = new Person("Andy", 32);
		Person p2 = new Person("Bill", 60);
		Person p3 = new Person("Carl", 48);		
		Person p4 = new Person("Derek", 79);
		Person p5 = new Person("Ed", 45);
		Person p6 = new Person("Fred", 87);
		Person p7 = new Person("Geoff", 46);		
		Person p8 = new Person("Harry", 24);
		Person p9 = new Person("Ian", 52);		
		Person p10 = new Person("Jake", 17);

		System.out.println();
		System.out.println("Add some people to the queue");

		market.insert(p1);
		market.insert(p2);
		market.insert(p3);
		market.insert(p4);
		market.insert(p5);

		System.out.println();
		System.out.println("Remove a couple of people");

		market.retrieve();
		market.retrieve();

		System.out.println();
		System.out.println("Add a few more");

		market.insert(p6);
		market.insert(p7);
		market.insert(p8);
		market.insert(p9);
		market.insert(p10);

		System.out.println();
		System.out.println("Remove a couple more people");

		market.retrieve();
		market.retrieve();

		System.out.println();
		System.out.println("Remove everyone else");

		market.retrieve();
		market.retrieve();
		market.retrieve();
		market.retrieve();
		market.retrieve();
		market.retrieve();

		System.out.println();
		System.out.print("Queue should now be empty...");

		market.retrieve();

		System.out.println();

	}


}