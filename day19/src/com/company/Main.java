import java.util.*;

    public class ChrisArraySort {
        public static void main (String [] args) {
            new ChrisArraySort().launcher();
        }

        private void launcher(){

            String[] initialArray = {"a", "men", "g", "feet", "3", "top"};
            Arrays.sort(initialArray, (o1,o2) -> (o1.contains("e") ? -1 : +1) - (o2.contains("e") ? -1 : +1));
            //Arrays.sort(initialArray, (o1, o2)-> o1.compareTo(o2));
            //Arrays.sort(initialArray, (o1, o2)-> -1*(o1.length()-o2.length()));
            System.out.println(Arrays.asList(initialArray));
        }
        /**class StringComparator implements Comparator<String>{
         public int compare(String o1, String o2){
         return o1.compareTo(o2);
         }
         }*/

    }

/**class StringUtility{
 public int static eChecker(String o1, String o2){

 return (o1.contains('e') ? -1 : +1) - (o2.contains('e') ? -1 : +1);
 }
 }*/



}
