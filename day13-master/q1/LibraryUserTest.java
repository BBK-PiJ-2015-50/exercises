import org.junit.*;
import static org.junit.Assert.*;

public class LibraryUserTest {
	private LibraryUser user;
	private final static String name = "Derek";
	private LibraryMock libM;
	
	@Before
	public void setup(){
		user = new LibraryUserImpl(name);
		libM = new LibraryMock();
	}
	
	@Test
	public void getLibraryUserNameTest() {
		assertEquals(name, user.getName());
	}
	
	@Test
	public void getLibraryUserIdTest() {
		int expectedId = -1;
		assertEquals(expectedId, user.getId());
	}
	
	public void getLibraryTest() {
		user.register(libM);
		assertEquals(libM, user.getLibrary());
	}
	
}