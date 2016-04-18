public class test_1
{
	public static void main (String args[])
	{
		
		Person p1 = new Person("Adam", 20);
		Person p2 = new Person("Charlie", 40);
		Person p3 = new Person("Java", 70);		
		Person p4 = new Person("R", 70);
		
		/******************************************************************************************
		* Note that we are declaring the variable 's' a PersonQueue which means we can only call the methods 
		* given in the interfacte personQueue - i.e. insert() and retrieve().
		*******************************************************************************************/
		PersonQueue s = new Supermarket();

		s.insert(p1);
		s.insert(p2);
		s.insert(p3);
		s.insert(p4);

		System.out.println();

		s.retrieve();
		s.retrieve();
		s.retrieve();
		s.retrieve();

		// What if there are no person in the queue, can we still retrieve?

		s.retrieve();
		
	}
}
