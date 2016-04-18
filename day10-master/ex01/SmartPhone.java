public class SmartPhone extends MobilePhone {

	// browseWeb(String) method
	public void browseWeb(String web) {
		System.out.println("WEB BROWSING " + web);
	}
	
	public void findPosition(String position) {
		System.out.println("GPS " + position);
	}

	/** routing your international calls through the internet
	 * overrides the method call(String) inherited from OldPhone
	 * If the string parameter starts with “00”,
	 * the method should output “Calling <number> through the internet to save money”;
	 * otherwise, the method should do the same as the original method (hint: use super).
	 
	 @Override
	 public void call(String number) {
		 super
	 
	 
}