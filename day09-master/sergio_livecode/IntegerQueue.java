public class IntegerQueue implements Queue {

	private IntegerElement head;

	
	public void insert(int n) {
		IntegerElement newElement = new IntegerElement(n);
		if (head == null) {
			head = newElement;
			return;
		} 

		IntegerElement current = head;
		while (current.getNext() != null) {
			current = current.getNext();
		}
		current.setNext(newElement);
	}	

	public int retrieve_OLD() {
		IntegerElement resultAsNode = head;
		head = head.getNext();
		return resultAsNode.getValue();
	}

	public int retrieve() {
		if (head == null) {
			return Integer.MIN_VALUE;
			// return null;
			// return 0;
			// return -1;
			// throw new EmptyQueueException() (Day 16)
		}

		int result = head.getValue();
		head = head.getNext();
		return result;
	}

}