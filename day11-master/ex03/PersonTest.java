import org.junit.*;
import static org.junit.Assert.*;

public class PersonTest {

	private Person p;

    @Before
    public void instantiate() {
        p = new Person();
    }

	@Test
	public void testsNormalName() {
		String input = "Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(expected, output);
	}

	@Test
	public void testsNameWithLeadingSpace() {
		String input = " Dereck Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(expected, output);
	}

	@Test
	public void testsNameWithExtraSpaces() {
		String input = "Dereck  Robert Yssirt";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(expected, output);
	}

	@Test
	public void testsNameWithSpaceAtEnd() {
		String input = "Dereck Robert Yssirt ";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(expected, output);
	}

	@Test
	public void testsNameWithExtraSpacesEverywhere() {
		String input = "   Dereck   Robert   Yssirt   ";
		String output = p.getInitials(input);
		String expected = "DRY";
		assertEquals(expected, output);
	}
}