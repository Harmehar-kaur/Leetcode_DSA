package codingstudio.array;

public class leftRotateArray {

    static int[] rotateArray(int[] arr, int n) {
        // Write your code here.
        int []   ans= new int[1];
        for(int i=0;i<1;i++){
            ans[0]=arr[i];
        }

        for(int i=1;i<n;i++){
            arr[i-1]=arr[i];
        }

        for (int i=n-1;i<n;i++){
            arr[i]=ans[i-(n-1)];
        }

        return  arr; 
    }
}

