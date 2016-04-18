public class HashUtilities {

	public static int ShortHash(int number) {
		int hash = Math.abs(number%1000);
		return hash;
	}
}