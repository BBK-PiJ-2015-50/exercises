public class MarketScript {
	
	public static void main(String[] args) {
		MarketScript script = new MarketScript();
		script.launch();
	}

	private void launch() {

		Supermarket market = new Supermarket();
		/** testing all Supermarket methods:
		insert(), retrieve(), addPerson(), servePerson()*/

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
		System.out.println("insert some people");

		market.insert(p1);
		market.insert(p2);
		market.insert(p3);
		market.insert(p4);
		market.insert(p5);

		System.out.println();
		System.out.println("retrieve a couple of people");

		market.retrieve();
		market.retrieve();

		System.out.println();
		System.out.println("addPerson a few more");

		market.addPerson(p6);
		market.addPerson(p7);
		market.addPerson(p8);
		market.addPerson(p9);
		market.addPerson(p10);

		System.out.println();
		System.out.println("servePerson a couple more people");

		market.servePerson();
		market.servePerson();

		System.out.println();
		System.out.println("servePerson everyone else");

		market.servePerson();
		market.servePerson();
		market.servePerson();
		market.servePerson();
		market.servePerson();
		market.servePerson();

		System.out.println();
		System.out.print("Queue should now be empty...");

		market.servePerson();

		System.out.println();

	}


}