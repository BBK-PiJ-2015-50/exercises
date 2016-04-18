public class LibraryUserImpl implements LibraryUser {
	/** users have a name & library ID(int), both must be unique */
	private int id;
	private String name;
	
	public LibraryUserImpl(String name) {
		this.name = name;
	}
	
	public String getName(){
		return name;
	}
	
	public int getId() {
		return -1;
	}
	
	/*public int register(Library) {
		
		
	}*/
}