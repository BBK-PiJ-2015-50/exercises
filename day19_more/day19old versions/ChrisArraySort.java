import java.util.*;

public class ChrisArraySort {
	public static void main (String [] args) {
		new ChrisArraySort().launcher();
	}
	
	private void launcher(){
		
		String[] initialArray = {"a", "g", "zoo", "3", "man", "top"};
		Arrays.sort(initialArray, new StringComparator());
		System.out.println(Arrays.asList(initialArray));
	}
	class StringComparator implements Comparator<String>{
		public int compare(String o1, String o2){
			return (-1 * o1.compareTo(o2));
		}
	}

}

