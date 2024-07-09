package PracticeWithJavaLighting.A;
import java.util.HashMap;
import java.util.Map;
public class HAshMapEx {
    public static void main(String[] args) {
        // Create a new HashMap
        Map<String, Integer> fruitPrices = new HashMap<>();

        // Add key-value pairs to the HashMap
        fruitPrices.put("Apple", 50);
        fruitPrices.put("Banana", 20);
        fruitPrices.put("Cherry", 70);
        System.out.println(fruitPrices);
        // {Apple=50, Banana=20, Cherry=70} (Order can vary)

//        // Retrieve a value using its key
        int applePrice = fruitPrices.get("Apple");
       System.out.println("Price of Apple: " + applePrice); // Price of Apple: 50
//
//        // Try adding a key-value pair with an existing key
       fruitPrices.put("Apple", 55);
       System.out.println(fruitPrices.get("Apple")); // 55
//
//        // Check if a key exists
        boolean hasMango = fruitPrices.containsKey("Mango");
       System.out.println("Has Mango? " + hasMango); // Has Mango? false

//        // Remove a key-value pair by key
        fruitPrices.remove("Banana");
       System.out.println(fruitPrices); // {Apple=55, Cherry=70} (Order can vary)
    }
}