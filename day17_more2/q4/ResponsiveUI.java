import java.util.Scanner;
import java.util.concurrent.TimeUnit;

public class ResponsiveUI implements Runnable {
	private int duration, taskNo;
	private int runningTasks = 0;
	private String finishedTasks = "";
	
	public ResponsiveUI(int duration, int taskNo) {
		this.duration = duration;
		this.taskNo = taskNo;
	}
	
	public static void main(String[] args) {
		ResponsiveUI rui = new ResponsiveUI();
		rui.launch();
	}
	
	public void launch() {
		
		Scanner in = new Scanner(System.in);
		for(int i=0;i<10;i++) {	
			System.out.print("Enter duration in ms of task " + i + ": ");
			Thread t = new Thread(new ResponsiveUI(in.nextInt(), i));
			runningTasks++;
			t.start();
			if (!finishedTasks.equals("")) {
				System.out.println("Finished tasks: " + finishedTasks);
				finishedTasks = "";
			}
		}
		while (runningTasks > 0) {
			System.out.println("Tasks still running: " + runningTasks + "\t- checking every second");
			try {
				TimeUnit.SECONDS.sleep(1);
			} catch (InterruptedException ex) {
				ex.printStackTrace();
			}
		}
		System.out.println("ALL TASKS COMPLETE");
	}
	
	public void run() {
		try {
			Thread.sleep(duration);
			runningTasks--;
		} catch (InterruptedException ex) {
			ex.printStackTrace();
		}
		synchronized(finishedTasks) {
			finishedTasks += (finishedTasks.equals("") ? taskNo : ", " + taskNo);
		}
	}
}