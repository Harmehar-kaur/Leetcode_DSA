package codingstudio.array;

import java.util.ArrayList;

public class ZeroMatrix {
    public static ArrayList<ArrayList<Integer>> zeroMatrix(ArrayList<ArrayList<Integer>> matrix, Integer n, Integer m) {
    	// Write your code here.
        boolean firstRowZero =false; 
        boolean firstColumnZero=false; 

        for(int i =0;i<m;i++){
            if(matrix.get(0).get(i)==0){
                firstRowZero=true;
                break; 
            }
        }

        for(int j=0;j<n;j++){
            if(matrix.get(j).get(0)==0){
                firstColumnZero = true; 
                break; 
            }
        }

        for(int i=1;i<n;i++){
            for(int j=1;j<m;j++){
                if(matrix.get(i).get(j)==0){
                    matrix.get(i).set(0,0); 
                    matrix.get(0).set(j,0); 
                }
            }
        }

        // Zero out marked rows
        for (int i = 1; i < n; i++) {
            if (matrix.get(i).get(0) == 0) {
                for (int j = 1; j < m; j++) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        // Zero out marked columns
        for (int j = 1; j < m; j++) {
            if (matrix.get(0).get(j) == 0) {
                for (int i = 1; i < n; i++) {
                    matrix.get(i).set(j, 0);
                }
            }
        }

        // Zero out first row if needed
        if (firstRowZero) {
            for (int j = 0; j < m; j++) {
                matrix.get(0).set(j, 0);
            }
        }

        // Zero out first column if needed
        if (firstColumnZero) {
            for (int i = 0; i < n; i++) {
                matrix.get(i).set(0, 0);
            }
        }

        return matrix;
    }
}
