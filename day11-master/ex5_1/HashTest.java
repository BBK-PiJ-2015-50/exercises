import java.util.Random;

public class HashTest {

	public static void main(String[] args) {
			HashTest hTest = new HashTest();
			hTest.launch();
	}
	
		public void launch() {
			
			for (int i=0;i<20;i++) {
				int randomNumber = new Random().nextInt();
				int smallHash = HashUtilities.ShortHash(randomNumber);
				System.out.println("0 < " + smallHash + " < 1000");
			}
			
		
		}
}


		