package week8;

import java.util.ArrayList;

public class PriorityArrayPersonQueue implements PersonQueue {
	
	ArrayList<Person> queue = new ArrayList<Person>();
	
	
	public boolean isEmpty(){
		return queue.isEmpty();
	}
	
	public int size(){
		return queue.size();
	}

	@Override
	public void insert(Person person) {
		queue.add(person);

	}

	@Override
	public Person retrieve() {
		if(queue.isEmpty()){
			return null;
		}
		Person p = retrieveFirstAboveAge(65);
		if (p!=null){
			queue.remove(p);
			return p;
		}
		p = retrieveFirstAboveAge(18);
		if (p!=null){
			queue.remove(p);
			return p;
		}
		p = queue.get(0);
		queue.remove(0);
		return p;
	}
	
	private Person retrieveFirstAboveAge(int age){
		Person p = null;
		for (Person person:queue){
			if(age<person.getAge()){
				if (p==null){
					return person;	
				}
			}		
		}
		return p;
		
	}

}
