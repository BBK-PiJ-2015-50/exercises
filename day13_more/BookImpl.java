public class BookImpl implements Book {
	private final String author, title;
	
	public BookImpl(String author, String title) {
		this.author = author;
		this.title = title;
	}
	
	public String getAuthor() {
		//return "Shakespeare";
		return author;
	}		
	
	public String getTitle() {
		//return "Hamlet";
		return title;
	}
}