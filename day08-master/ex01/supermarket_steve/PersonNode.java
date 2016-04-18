package week8;

public class PersonNode {
    private Person person;
    private PersonNode next;

    public PersonNode(Person person) {
	  this.person = person;
	  next = null;
    }

    /**
     * Returns the Person in this node
     */
    public Person getPerson() {
	  return person;
    }

    /**
     * Set the next node to point to the given node
     */
    public void setNext(PersonNode node) {
	  next = node;		
    }

    /**
     * Set the next node to point to the given node
     */
    public PersonNode getNext() {
	  return next;		
    }
}
