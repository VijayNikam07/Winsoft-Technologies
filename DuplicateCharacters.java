package program1;
import java.util.HashMap;
import java.util.Map;
public class DuplicateCharacters {

 public static void findDuplicateCharacters(String str) {
        
        Map<Character, Integer> charCountMap = new HashMap<>();

        
        str = str.toLowerCase();

        
        for (char c : str.toCharArray()) {
            // Increment the count of the character in the HashMap
            charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
        }

        
        System.out.println("Duplicate characters in the string:");
        for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + ": " + entry.getValue());
            }
        }
    }

    public static void main(String[] args) {
        String str = "Hello, World!";
        findDuplicateCharacters(str);
    }
}



