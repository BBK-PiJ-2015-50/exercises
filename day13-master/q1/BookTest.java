// Code tweaked when repeating with P/T - after seeing Keith's more concise ways

import org.junit.*;
//import static org.junit.Assert.*;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookTest {
	private Book instance;
	private final static String title = "Hamlet";
	private final static String author = "Shakespeare";
	
	@Before
	public void setup(){
		instance = new BookImpl(author, title);
	}

	@Test
	public void getBookTitleTest() {
	//String expectedTitle = "Hamlet";
	//instance = new BookImpl(null, expectedTitle);
	assertEquals(title, instance.getTitle());
	}
	
	@Test
	public void getBookAuthorTest() {
	//String expectedAuthor = "Shakespeare";
	//instance = new BookImpl(expectedAuthor, null);
	assertEquals(author, instance.getAuthor());
	}
	
	/*@Test
	public void getLibraryUserNameTestTest() {
	String expectedTitle = "Hamlet";
	instance = new BookImpl(null, expectedTitle);
	String result = instance.getTitle();
	assertEquals(expectedTitle, instance.getTitle());
	}*/
}