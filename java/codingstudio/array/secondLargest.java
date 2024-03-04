package codingstudio.array;

public class secondLargest {

    public static int findSecondLargest(int n, int[] arr) {
        if(n<2){
            return -1; 
        }

        int largest=Integer.MIN_VALUE; 
        int secondLargest=Integer.MIN_VALUE; 

        for(int num:arr){
            if(num>largest){
                secondLargest=largest;
                largest=num;
            }else if(num>secondLargest && num !=largest){
                secondLargest=num; 
            }
        }
        if(secondLargest==Integer.MIN_VALUE){
            return -1; 
        }

        return secondLargest; 
    }
    
}
