import org.junit.*;
import static org.junit.Assert.*;

public class LibraryMockTest {

	private LibraryMock instance;
	
	@Test
	public void getLibraryMockNameTest() {
	String expectedName = "Library Name";
	instance = new LibraryMock();
	String result = instance.getName();
	assertEquals(expectedName,result);
	}

	@Test
	public void getLibraryMockIdTest() {
	int expectedId = 13;
	instance = new LibraryMock();
	int result = instance.getId();
	assertEquals(expectedId,result);
		
	}
}