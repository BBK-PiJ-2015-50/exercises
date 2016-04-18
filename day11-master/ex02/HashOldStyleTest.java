import java.util.Random;

public class HashOldStyleTest {

	public static void main(String[] args) {
			HashOldStyleTest hTest = new HashOldStyleTest();
			hTest.launch();
	}
	
		public void launch() {
			
			for (int i=0;i<20;i++) {
				int randomNumber = new Random().nextInt();
				int smallHash = HashUtilities.shortHash(randomNumber);
				System.out.println("0 < " + smallHash + " < 1000");
			}
			
		
		}
}


		