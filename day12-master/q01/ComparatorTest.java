import java.util.Random;
import org.junit.*;
import static org.junit.Assert.*;

public class ComparatorTest {
	
	private Comparator instance;
	
	@Before
	public void init(){
		
		instance = new Comparator ();
	}
	
	@Test
	public void getMaxWithValidIntegersAsStringsTest() {
		
		String expected = "50.0";
		String low = "10";
		String high = "50";
		String result = instance.getMax(low, high);
		assertEquals(expected, result);
	}
	
	@Test
	public void getMaxWithValidDoublesAsStringsTest() {
		
		String expected = "50.0";
		String low = "10.0";
		String high = "50.0";
		String result = instance.getMax(low, high);
		assertEquals(expected, result);
	}
	
	@Test
	public void getMaxWithValidNegativeDoublesAsStringsTest() {
		
		String expected = "-10.0";
		String low = "-10.0";
		String high = "-50.0";
		String result = instance.getMax(low, high);
		assertEquals(expected, result);
	}
	
	@Test
	public void getMaxWithValidNegativeIntegersAsStringsTest() {
		
		String expected = "-10.0";
		String low = "-10";
		String high = "-50";
		String result = instance.getMax(low, high);
		assertEquals(expected, result);
	}
	
	@Test(expected=NullPointerException.class)
	public void getMaxWithNullStringsTest() {
		
		String high = "50";
		String result = instance.getMax(null, high);
		
	}
	
	@Test(expected=NumberFormatException.class)
	public void getMaxWithInvalidIntegersAsStringsTest() {
		
		String low = "dog";
		String high = "-50";
		String result = instance.getMax(low, high);
	}
}