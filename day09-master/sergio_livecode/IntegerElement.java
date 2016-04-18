public class IntegerElement {
	private int value;
	private IntegerElement next;

	public IntegerElement(int val) {
		this.value = val;
		this.next = null;
	}

	public int getValue() {
		return this.value;
	}

	public IntegerElement getNext() {
		return next;
	}

	public void setNext(IntegerElement nextEl) {
		this.next = nextEl;
	}

}