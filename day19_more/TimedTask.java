public class TimedTask implements Runnable {
	int time;
	
	TimedTask (int time) {
		this.time = time;
		if (time > 1000) {
			time = 1000;
		}
	}

	public void run() {
		try {
			Thread.sleep(time);
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
	}
}