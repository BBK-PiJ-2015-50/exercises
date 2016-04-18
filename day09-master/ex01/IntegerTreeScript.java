public class IntegerTreeScript {
	public static void main(String[] args) {
	 	IntegerTreeScript script = new IntegerTreeScript();
		script.launch();
	}

	public void launch() {
		// create root
		IntegerTreeNode root1 = new IntegerTreeNode(6);
		// test with some elements
		root1.add(5);
		root1.add(209);
		root1.add(37);
		root1.add(-8);
		root1.add(11);
		root1.add(129);
		root1.add(3);
		System.out.println("");
		System.out.println("Representation of tree...");
		System.out.println(root1.toString());

		System.out.println("Maximum value stored in tree = " + root1.getMax());
		System.out.println("Minimum value stored in tree = " + root1.getMin());
		System.out.println("");
	}

}


	
	