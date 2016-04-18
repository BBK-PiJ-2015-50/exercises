public interface LibraryUser {
	/** users have a name & library ID(int), both must be unique */
	String getName();
		
	int getId();
	
	void setID(int id);
	
	int register(Library library);
	
	Library getLibrary();
}