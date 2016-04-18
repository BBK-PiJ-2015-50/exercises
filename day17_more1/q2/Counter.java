public class Counter {
	private int n = 0;
	private final Object obj = new Object();
	
	public synchronized void increase() {
			n++;
	}
	public int getCount() {
			return n;
	}
}