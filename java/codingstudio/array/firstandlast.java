package codingstudio.array;

import java.util.ArrayList;

public class firstandlast {

    public static int[] firstandlastoccurence(ArrayList<Integer> arr, int n,int k){
        int first = searchFirst(arr,n,k);
        int last = searchLast(arr,n,k);
        return new int[]{first,last}; 
    }

    public static int searchFirst(ArrayList<Integer> arr,int n,int k){
        int first=-1; 
        int start=0; 
        int end =n-1;

        while(start<=end){
            int mid=start+ (end-start)/2; 

            if(arr.get(mid)==k){
                first = mid;
                end = mid - 1;
            }
            else if (arr.get(mid) < k) { // if the element at mid is less that k then k must be present in the right half
                start = mid + 1;
            } else {//arr.get(mid) > k that means ki the k value must be on the left of the mid because the array givne is sorted 
                end = mid - 1;
            }

        }
        return first; 
    }

    public static int searchLast(ArrayList<Integer> arr,int n,int k){
        int last=-1; 
        int start=0; 
        int end =n-1;

        while(start<=end){
            int mid=start+ (end-start)/2; 

            if(arr.get(mid)==k){
                last = mid;
                end = mid + 1;
            }
            else if (arr.get(mid) < k) { // if the element at mid is less that k then k must be present in the right half
                start = mid + 1;
            } else {//arr.get(mid) > k that means ki the k value must be on the left of the mid because the array givne is sorted 
                end = mid - 1;
            }

        }
        return last; 
    }


}
    

