public class test_2
{
	public static void main (String args[])
	{
		
		Person p1 = new Person("Adam", 20);
		Person p2 = new Person("Charlie", 40);
		Person p3 = new Person("Java", 70);		
		Person p4 = new Person("R", 70);

		/******************************************************************************************
		* Note that we are declaring the variable 's' a Supermarket. As a result, we can call all the methods 
		* given in the Supermarket class, which includes those given in the interface personQueue - i.e. insert() and retrieve().
		*******************************************************************************************/
		Supermarket s = new Supermarket();

		s.addPerson(p1);
		s.insert(p2);
		s.addPerson(p3);
		s.insert(p4);

		System.out.println();

		s.servePerson();
		s.retrieve();
		s.servePerson();
		s.retrieve();
		s.servePerson();
		
	}
}
