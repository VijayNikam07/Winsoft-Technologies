package program1;
import java.util.HashMap;
import java.util.Map;

public class WordCount {

	public static Map<String, Integer> countWords(String sentence) {
	     
        String[] words = sentence.trim().split("\\s+");

       
        Map<String, Integer> wordCountMap = new HashMap<>();

       
        for (String word : words) {
            
            String lowercaseWord = word.toLowerCase();
            
            
            wordCountMap.put(lowercaseWord, wordCountMap.getOrDefault(lowercaseWord, 0) + 1);
        }

        return wordCountMap;
    }

    public static void main(String[] args) {
        String sentence = "Java is a programming language Java is widely used for writing code";
        Map<String, Integer> wordCounts = countWords(sentence);

      
        System.out.println("Word Counts:");
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

}
