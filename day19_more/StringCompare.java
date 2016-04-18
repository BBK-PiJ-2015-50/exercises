public class StringCompare {
	public static int compare(String o1, String o2){
		return (o1.contains("e") ? -1 : +1) - (o2.contains("e") ? -1 : +1);
	}
}
		