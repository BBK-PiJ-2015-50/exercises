public class InitialsFromFullName {
	
	public static void main(String[] args) {
			InitialsFromFullName initFromName = new InitialsFromFullName();
			initFromName.launch();
	}
		public void launch() {
			Person person = new Person();		
			System.out.println("Enter fullName");
			String name = System.console().readLine();
			String initials = person.getInitials(name);
			System.out.println(initials);
		
		
		
		/**		public String getInitials(String fullName) {
				String result = "";
				String[] words = fullName.split(" ");
				for (int i = 0; i < words.length; i++) {
					String nextInitial = "" + words[i].charAt(0);
					result = result + nextInitial.toUpperCase();
				}
				return result;
			}*/
	
}

}


