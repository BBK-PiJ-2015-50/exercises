package week8;

import java.util.ArrayList;

public class UnfairArrayPersonQueue implements PersonQueue {
	
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
		if (queue.isEmpty()){
			return null;
		}
		Person p = queue.get(0);
		for (Person person:queue){
			if(p.getAge()<person.getAge()){
				p = person;
			}		
		}
		queue.remove(p);
		return p;
	}

}
