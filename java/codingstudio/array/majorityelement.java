package codingstudio.array;

public class majorityelement {
    public static int findMajority(int[] arr, int n) {
        // Write your code here.
        int count = 0;
        int ans = -1;

        for (int i : arr) {
            if (count == 0) {
                ans = i;
                count = 1;
            } else if (ans == i) {
                count++;
            } else {
                count--;
            }
        }

        count = 0;
        for (int i : arr) {
            if (i == ans) {
                count++;
            }
        }

        if (count > n / 2) {
            return ans;
        }

        else {
            return -1;
        }
    }
}
