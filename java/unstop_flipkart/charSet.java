package unstop_flipkart;
import java.util.*;
public class charSet {
    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            int T = scanner.nextInt();
            for (int i = 0; i < T; i++) {
                int N = scanner.nextInt();
                char[] charSet = new char[N];
                for (int j = 0; j < N; j++) {
                    charSet[j] = scanner.next().charAt(0);
                }
                char[] result = findErrors(charSet, N);
                System.out.println("[" + result[0] + " " + result[1] + "]");
            }
        }
    }

    public static char[] findErrors(char[] charSet, int N) {
        char duplicate = '\0';
        char missing = '\0';
        boolean[] present = new boolean[26];
        for (char c : charSet) {
            if (present[c - 'a']) {
                duplicate = c;
            } else {
                present[c - 'a'] = true;
            }
        }
        for (int i = 0; i < N; i++) {
            if (!present[i]) {
                missing = (char) ('a' + i);
                break;
            }
        }
        return new char[]{duplicate, missing};
    }
}
