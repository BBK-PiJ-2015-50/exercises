import java.util.Random;
import org.junit.*;
import static org.junit.Assert.*;

public class ShortHashTest {
	@Test
	public void testsIntegerRange() {
		
		
		for (int i=0;i<1000000;i++) {
				int randomNumber = new Random().nextInt();
				int result = HashUtilities.shortHash(randomNumber);
				int expectedLow = 0;
				assertTrue(expectedLow <= result);
				int expectedHigh = 1000;
				assertTrue(expectedHigh >= result);
			}
		
	
		
		
	}
}