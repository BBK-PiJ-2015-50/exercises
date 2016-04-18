public class Person
{
	private String name;
	private int age;
	private Person next;

	/******************************************************************************************
	* A constructor that initialises the fields to some given values.
	*******************************************************************************************/
	Person(String s, int a)
	{
		this.setName(s);
		this.setAge(a);
		this.setNext(null);
	}
	
	/******************************************************************************************
	* Note here that the person can add another to the queue.
	*******************************************************************************************/

	public void add(Person p)
	{
		if(this.next == null)
			this.next = p;
		else
			this.next.add(p);
	}
	
	/******************************************************************************************
	* Setter and getter methods (i.e. accessors and mutators)
	*******************************************************************************************/

	public String getName()
	{
		return this.name;
	}
	
	public int getAge()
	{
		return this.age;
	}
	
	public Person getNext()
	{
		return this.next;
	}
	
	public void setName(String s)
	{
		this.name = s;
	}
	
	public void setAge(int a)
	{
		this.age = a;
	}
		
	public void setNext(Person p)
	{
		this.next = p;
	}
		
	/******************************************************************************************
	* An implementation for toString() method which is used here to simplify printing the 
	* contents of Person object
	*******************************************************************************************/

	public String toString()
	{
		return "The person named: " + name + ", age: " + age;
	}
}
