public class Increaser implements Runnable {
	private SynchronizedCounter c;
	
	public Increaser(SynchronizedCounter counter) {
		this.c = counter;
	}
	public static void main(String args[]) {
		SynchronizedCounter counter = new SynchronizedCounter();
		for (int i = 0; i < 100; i++) {
			Increaser increaserTask = new Increaser(counter);
			Thread t = new Thread(increaserTask);
			t.start();
		}
	}
	
	public void run() {
		System.out.println("Starting at " + c.getCount());
		for (int i = 0; i < 1000; i++) {
			try {
				Thread.sleep(3);
			}
			catch(InterruptedException e) {
				// did nothing !
				
			}
				
			
			
			c.increase();
		}
		System.out.println("Stopping at " + c.getCount());
	}
}