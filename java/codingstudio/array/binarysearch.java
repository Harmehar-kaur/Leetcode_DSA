package codingstudio.array;

public class binarysearch {
    public static int search(int[] nums, int target) {
        // Write your code here.
        int n = nums.length;
        for (int i = 0; i < n; i++) {
            if (nums[i] == target) {
                return i;
            }
        }
        return -1;
    }

}