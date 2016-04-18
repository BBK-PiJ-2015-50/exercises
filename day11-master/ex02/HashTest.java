import java.util.Random;
import org.junit.*;
import static org.junit.Assert.*;

public class HashTest {
	@Test
	public void testsIntegerRange() {
		for (int i=0;i<1000000;i++) {
				int input = new Random().nextInt();
				int result = HashUtilities.shortHash(input);
				int expectedLow = 0;
				assertTrue(expectedLow <= result);
				int expectedHigh = 999;
				assertTrue(expectedHigh >= result);
			}	
	}

	@Test
	public void testsZero() {
		int input = 0;
		int result = HashUtilities.shortHash(input);
		int expected = 0;
		assertEquals(expected, result);
	}

	@Test
	public void tests1000() {
		int input = 1000;
		int result = HashUtilities.shortHash(input);
		int expected = 0;
		assertEquals(expected, result);
	}

	@Test
	public void testsMultipleOf1000() {
		int input = 3400000;
		int result = HashUtilities.shortHash(input);
		int expected = 0;
		assertEquals(expected, result);
	}

	@Test
	public void tests999() {
		int input = 999;
		int result = HashUtilities.shortHash(input);
		int expected = 999;
		assertEquals(expected, result);
	}

	@Test
	public void testsUpperBound() {
		int input = 56423999;
		int result = HashUtilities.shortHash(input);
		int expected = 999;
		assertEquals(expected, result);
	}

	@Test
	public void testsMiddle() {
		int input = 2398745;
		int result = HashUtilities.shortHash(input);
		int expected = 745;
		assertEquals(expected, result);
	}
}