public class IntegerTreeNode {
	private int value;
	private IntegerTreeNode left;
	private IntegerTreeNode right;
	

	public IntegerTreeNode(int value) {
		this.value = value;
		left = null;
		right = null;
	}
	
	public IntegerTreeNode() {
		left = null;
		right = null;
	}
	

	// adding elements to a tree
	public void add(int newNumber) {
		if (newNumber > this.value) {
			if (right == null) {
				right = new IntegerTreeNode(newNumber); 
			} else {
				right.add(newNumber);
			}
		} else {
			if (left == null) {
				left = new IntegerTreeNode(newNumber);
			} else {
				left.add(newNumber);
			}
		}
	}



	// finding elements in a tree
	public boolean contains(int n) {
		if (n == this.value) {
			return true;
		} else if (n > this.value) {
			if (right == null) {
				return false;
			} else {
				return right.contains(n);
			}
		} else {
			if (left == null) {
				return false;
			} else {
				return left.contains(n);
			}
		}
	}

	public String toString() {
		return "[" + value
				 + ((left == null) ? "" : left.toString())
				 + ((right == null) ? "" : right.toString()) + "]";
	}

	// more complicated representation
	// public String toString() {
	// 		return "[" + value + 
	// 		" L" + ((left == null) ? "[]" : left.toString()) + 
	// 		" R" + ((right == null) ? "[]" : right.toString()) + "]";
	// }
	
	// getMax() - returns max value stored in tree
	public int getMax() {
		if (this.right == null) {
			return this.value;
		}
		return this.right.getMax();
	}
	
	// getMin() - returns min value stored in tree
	public int getMin() {
		if (this.left == null) {
			return this.value;
		}
		return this.left.getMin();
	}

	
}


