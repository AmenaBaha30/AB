package MyPractice;
import java.util.HashMap;

public class AyeshaPHashMap {

        public static void main(String[] args) {
//            HashMap<String, String> capitalCities = new HashMap<String, String>();
//            capitalCities.put("England", "London");
//            capitalCities.put("Germany", "Berlin");
//            capitalCities.put("Norway", "Oslo");
//            capitalCities.put("USA", "Washington DC");
//            //capitalCities.remove("England");
//            //capitalCities.clear();
//           // System.out.println(capitalCities.get("England"));
//          //System.out.println(capitalCities.size());
//            System.out.println(capitalCities);

            HashMap<String, String> book = new HashMap<String, String>();
            book.put("A", "B");
            book.put("C", "V");
            book.put("K", "L");
            book.put("M", "Q");
            HashMap copy = (HashMap) book.clone();
            copy.remove("M");
            //book.clear();
            //book.remove("A");
            //System.out.println(book.size());
            //System.out.println(book.get("A"));
            //System.out.println(copy);
            System.out.println(book);

        }
}


