public class SynchronizedCounter {
	private int n = 0;
	private final Object obj = new Object();
	
	public synchronized void increase() {
		//synchronized (obj){
			n++;
		//}
		
	}
	public int getCount() {
			return n;
	}
}