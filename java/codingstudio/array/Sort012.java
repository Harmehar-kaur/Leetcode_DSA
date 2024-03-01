

//Steps of the dutch national flag algorithm
// The problem is similar to “Segregate 0s and 1s in an array”.
// The problem was posed with three colors, here `0′, `1′ and `2′. The array is divided into four sections: 
// arr[1] to arr[low – 1]
// arr[low] to arr[mid – 1]
// arr[mid] to arr[high – 1]
// arr[high] to arr[n]
// If the ith element is 0 then swap the element to the low range.
// Similarly, if the element is 1 then keep it as it is.
// If the element is 2 then swap it with an element in high range.

import java.util.*;

public class Sort012{
    public static void sort012(int[] arr) {
        int low = 0;
        int mid = 0;
        int high = arr.length - 1;
        
        while (mid <= high) {
            if (arr[mid] == 0) {
                swap(arr, low, mid);
                low++;
                mid++;
            } else if (arr[mid] == 1) {
                mid++;
            } else { // arr[mid] == 2
                swap(arr, mid, high);
                high--;
            }
        }
    }
    
    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int t = scanner.nextInt();
        
        while (t-- > 0) {
            int n = scanner.nextInt();
            int[] arr = new int[n];
            
            for (int i = 0; i < n; i++) {
                arr[i] = scanner.nextInt();
            }
            
            sort012(arr);
            
            for (int num : arr) {
                System.out.print(num + " ");
            }
            System.out.println();
        }
        
        scanner.close();
    }
}

    
