package DSA.arrays;

import java.util.ArrayList;

class staticanddynamic {

    public static void main(String[] args){
        int [] arr={10,20,30,40}; 

        for(int j=0; j<4;j++){
            System.out.println(arr[j]);
        }
        
        ArrayList<Integer> dynamArr= new ArrayList<>(); 
        for (int i = 1; i <= dynamArr.size(); i++) {
            dynamArr.add(i);
        }
        System.out.println(dynamArr);
    }
}