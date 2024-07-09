package MyPractice;

import java.util.*;

public class Main {

    public static void main(String[] args) {
        int[] numbers = { 10, 15, 10, 1, 3, 5, 4, 0, 1, 1, 1, 0, 10 };
        // Convert array to List
        List<Integer> list = new ArrayList<>();
        for (int number : numbers) {
            list.add(number);
        }
        // Convert List to HashSet to remove duplicates
        Set<Integer> set = new HashSet<>(list);

        // Convert HashSet back to array
        Integer[] uniqueNumbers = set.toArray(new Integer[0]);

        // Print unique values
        for (Integer number : uniqueNumbers) {
            System.out.println(number);
        }
    }
}