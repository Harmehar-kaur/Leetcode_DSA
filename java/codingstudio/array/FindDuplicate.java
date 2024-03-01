package codingstudio.array;

import java.util.*; 

public class FindDuplicate{
    public static int findduplicate(int n,ArrayList<Integer> arr){
        int[] frequency = new int[n+1];

        for(int num:arr){
            frequency[num]++;
        }

        for(int i=0;i<=n;i++){
            if(frequency[i]>1){
                return i; 
            }
        }

        return -1; 
    }


    //this is another question but since the answer was kinda same this is used again
    public static int findDuplicate(ArrayList<Integer> arr) {

		//    Write your code here.
		int n=arr.size(); 
		int[] frequency = new int[n+1];

        for(int num:arr){
            frequency[num]++;
        }

        for(int i=0;i<=n;i++){
            if(frequency[i]>1){
                return i; 
            }
        }

        return -1; 
	}
}

/* In the above code we make a array to store frequency and then iterate throught the array increasing the frequency of the 
 * indexes according to the value of the particular element in the arraylist. For ex: in arr at index 1 element stored is 
 * 3 then frequency[3] is icremented that is the 3rd index is incremented and if the value would would be more than one finally 
 * that particular index is returned. We have the integer values in the range (1,n-1) therefore for a array of size 1,n+1 it
 * would cover all the elements in the arraylist. 
 */