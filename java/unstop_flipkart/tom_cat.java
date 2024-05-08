package unstop_flipkart;
import java.util.*;
public class tom_cat {
    
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int T = scanner.nextInt();  // Number of test cases
            
            for (int t = 0; t < T; t++) {
                // int N = scanner.nextInt();  // Length of the sentence (number of words)
                scanner.nextLine();  // Consume the newline after the integer
                
                String[] words = scanner.nextLine().split(" ");
                
                Set<String> seenWords = new HashSet<>();
                StringBuilder result = new StringBuilder();
                
                for (String word : words) {
                    if (!seenWords.contains(word)) {
                        seenWords.add(word);
                        result.append(word).append(" ");
                    }
                }
                
                // Print the result for the current test case
                System.out.println(result.toString().trim());
            }
            
            scanner.close();
        }
    }
}

    

