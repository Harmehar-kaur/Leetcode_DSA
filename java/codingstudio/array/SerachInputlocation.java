package codingstudio.array;

public class SerachInputlocation {
    public static int searchInsert(int[] arr, int m) {
        // Write your code here.
        int count = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] < m) {
                count++;
            }
        }
        return count;
    }
}
