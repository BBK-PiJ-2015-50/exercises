package week8;

public class PointerPersonQueue implements PersonQueue {
	
	PersonNode queue;

	@Override
	public void insert(Person person) {
		if (queue == null){
			queue = new PersonNode(person);
		} else if (queue.getNext() == null){
			queue.setNext(new PersonNode(person));
		} else {
			PersonNode node = queue;
			while (node.getNext()!=null){
				node = node.getNext();
			} 
			node.setNext(new PersonNode(person));
		}

	}

	@Override
	public Person retrieve() {
		if (queue == null){
			return null;
		}
		Person served = queue.getPerson();
		queue = queue.getNext();
		return served;

	}

	public boolean isEmpty() {
		return queue==null;
	}

}
