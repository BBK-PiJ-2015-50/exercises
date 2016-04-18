public class MobilePhone extends OldPhone {
	private int callCount = 0;
	private int i;
	private final String[] callHistoryArray = new String[10];

	

	public void ringAlarm(String alarm) {
		System.out.println("ALARM! " + alarm);
	}
	
	public void playGame(String game) {
		System.out.println("GAME! " + game);
	}
	
	
	// keeps list of last 10 numbers called
	

	public void call(String number) {
		System.out.println("Calling " + number);
		callHistoryArray[callCount++] = number;
		if (callCount == 10) {
			callCount = 0;
		}
			
	}
		 
		/** class keeps a list of the last ten numbers that have been called
		 *which can be printed with the method printLastNumbers()
		 */
	
	public void printLastNumbers() {
		System.out.println("Last 10 numbers dialed were...");
		for(int i = 0; i < 10; i++) {
			System.out.println(callHistoryArray[i]);
		}
		

		
		
		
		
		
		
	}
}