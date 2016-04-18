public class Supermarket implements PersonQueue
{
	Person head;

	/******************************************************************************************
	* Adds another person to the rear of the queue.
	*******************************************************************************************/

	public void insert(Person person)
	{
		if(head == null)
			head = person;
		else
			head.add(person);
		System.out.println(person + " has been added.");
	}

	/******************************************************************************************
	* Removes a person from the head of the queue. 
	*******************************************************************************************/

	public Person retrieve()
	{
		if (head == null) 
		{
			System.out.println("There is no person to be retrieved.");
			return null;
		}
		Person temp = head;
		head = head.getNext();
		System.out.println(temp + " has been retrieved.");
		return temp;
	}
	
	/******************************************************************************************
	* These are the two methods that the Supermarket class needs to implement, in addition to the
	* methods given in the interface (See the exercise question).
	*******************************************************************************************/

	public void addPerson(Person p)
	{
		System.out.println();
		System.out.println("You are using a method that has not been given in the interface PersonQueue");
		//System.out.println();
		insert(p);
	}

	public Person servePerson()
	{
		System.out.println();
		System.out.println("This method has not been given in the interface PersonQueue");
		//System.out.println();
		return retrieve();
	}
}
