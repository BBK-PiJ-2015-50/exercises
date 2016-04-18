// provided code - NOT synchronized
/*public class Counter {
	private int n = 0;

	public void increase() {
			n++;
	}
	
	public int getCount() {
			return n;
	}
}*/

// synchronized on increase() method
/*public class Counter {
	private int n = 0;
	
	public synchronized void increase() {
			n++;
	}

	public int getCount() {
			return n;
	}
}*/


// synchronized on "dummy" object obj
public class Counter {
	private int n = 0;
	private final Object obj = new Object();

    public void increase() {
        synchronized (obj) {
            n++;
        }
    }
	
	public int getCount() {
			return n;
	}
}

// synchronized on "this" object
// ie. the object where the code is being executed
/*public class Counter {
    private int n = 0;

    public void increase() {
        synchronized (this) {
            n++;
        }
    }

    public int getCount() {
        return n;
    }
}*/