package codingstudio.array;
import java.util.*; 
public class SumOfTwoArray {

    public static int[] findArraySum(int[] a, int n, int[] b, int m){
        int maxlen = Math.max(n,m); 
        int res = new int[maxlen+1]; 
        int carry =0; 

        int i=n-1,j=m-1,k=maxlen; 
        while(i>=0 || j>=0){
            int sum =carry; 
            if(i>=0){
                sum+=a[i--];
            }
            if(j>=0){
                sum+=b[j--]; 
            }
            res[k--] = sum%10; 
            carry=sum/10; 
        }

        if(carry>0){
            res[k--]=carry; 
        }

        int startIndex = (result[0]!=0)? 0:1; 
        int[] ans = Arrays.copyOfRange(res, startIndex,res.length); 

        return ans; 
    }
    
}
