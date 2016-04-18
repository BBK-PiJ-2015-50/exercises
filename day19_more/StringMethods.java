public class StringMethods {
	public static int compare(String o1, String o2){
		return (o1.contains("e") ? -1 : +1) - (o2.contains("e") ? -1 : +1);
	}
	
	public static String betterString(String s1, String s2, TwoStringPredicate check) {
		if (check.whichString(s1, s2)) {
			return s1;
		}
		else {
			return s2;
		}
	}
	
}
		