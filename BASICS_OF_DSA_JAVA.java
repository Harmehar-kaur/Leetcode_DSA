//Print Name And Age
import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner s = new Scanner(System.in); 
		String name = s.nextLine(); 
		int age = s.nextInt(); 
		System.out.println("The name of the person is "+name+" and the age is "+age+".");
}
}


//Swap Numbers 
public class Solution{
    public static void swapNumber(int []a, int []b) {
        // Write your code here.
        
        // the for is used here because the arguments are passed as arrays if the 
        // for loop is not executed then this would be not executed at all
        for (int i = 0; i < a.length; i++) {
            int temp = a[i];
            a[i] = b[i];
            b[i] = temp;
        }
    }
}

//Simple Interest
import java.util.* ;
import java.io.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner s = new Scanner(System.in); 
		int principalAmount = s.nextInt(); 
		float rateOfInterest= s.nextFloat();
		int timePeriod = s.nextInt();
		float simpleInterest = (principalAmount*rateOfInterest*timePeriod)/100;
		int Interest = (int)simpleInterest;
		System.out.println(Interest); 
		
	}
}

//Sum of even Numbers
import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt();
		int sumOfEvenNumber = 0; 
		for(int i=0; i<=n;i+=2){
			sumOfEvenNumber+=i; 
		}
		System.out.println(sumOfEvenNumber);
	}
}


//Farenheit to celsius 

from os import *
from sys import *
from collections import *
from math import *

#Your code goes here

S=int(input())
E=int(input())
W=int(input())
celsiusTemp=0
for i in range(S,E+1,W): 
    celsiusTemp = int((i-32)*5/9)
    if(celsiusTemp >= 0):
        celsiusPrint = floor(celsiusTemp)
    else:
        celsiusPrint =ceil(celsiusTemp)
    print(i,celsiusPrint,sep=" ") 


//sum of even and odd digits
import java.util.Scanner;
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner s = new Scanner(System.in); 
		int n = s.nextInt();
		int evenSum=0,oddSum=0; 
		while(n > 0) {
			int last = n % 10;
			if(last % 2 == 0) {
				evenSum += last;
			}
			else {
				oddSum += last;
			}
			
			n = n / 10;
		}
		// for i in 
		System.out.println(evenSum+" "+oddSum); 
		
	}
}

//power of a number
import java.util.* ;
import java.io.*;
import java.lang.*; 
class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner s= new Scanner(System.in);
		int x=s.nextInt();
		int n=s.nextInt();
		int powerOfTheNumber=0;
		if(n==0){
			powerOfTheNumber = 1;
		}else{
			powerOfTheNumber = (int)Math.pow(x,n);
		}
		System.out.println(powerOfTheNumber);
	}
}

//Factorial Of Number 
import java.util.Scanner;

class Solution {
	
	public static void main(String args[]) {
		
		// Write code here
		Scanner s= new Scanner(System.in); 
		int n = s.nextInt(); 
		if(n<0)
		{
			System.out.println("Error");
		}
		else
		{  
			int fact = 1;
			for (int i=2;i<=n;i++){
				fact = fact*i;
			}
			System.out.println(fact);
		}
		
		
	}
}

//Nth fibonaci 

/*
    Time Complexity: O(log(N)).
    Space Complexity: O(log(N)).

    Where 'N' is the given integer.
*/

public class Solution{
    static int[][] multiply(int[][] a, int[][] b) {
        int mod = (int) (1e9 + 7);
        int[][] c = new int[2][2];
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                c[i][j] = 0;
            }
        }
        for (int i = 0; i < 2; i++) {
            for (int j = 0; j < 2; j++) {
                for (int k = 0; k < 2; k++) {
                    c[i][k] = (int) ((c[i][k] + (long) ((long) a[i][j] * (long) b[j][k])) % mod);
                }
            }
        }

        return c;
    }

    // Function to calclate n'th power of a matrix.
    static int[][] matrix_power(int[][] coef, int n) {

        // To store the resultant matrix.
        int[][] res = {{1, 0}, {0, 1}};

        // While loop till n > 0.
        while (n > 0) {
            // If n is odd, multiply res with coef.
            if (n % 2 != 0) res = multiply(res, coef);

            // Multiply coef with coef and update n to n/2.
            coef = multiply(coef, coef);
            n /= 2;
        }

        return res;

    }

    public static int fibonacciNumber(int n) {
        int[][] coef = {{0, 1}, {1, 1}};

        // Calculating the (n-1)th power of the coef matrix.
        int[][] res = matrix_power(coef, n - 1);

        // Return the bottom right element of the resultant matrix.
        return res[1][1];


    }
}

//Count of prime
import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class CountPrime {
	
	// Write your totalPrime function here

	private boolean isPrime(int n){
		if(n<1){
			return false; 
		}
		for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
	}
	public int totalPrime(int s,int e){
		int countOfPrime=0;
		for(int i=s; i<=e;i++){
			if(isPrime(i)){
				countOfPrime++;
			}
		}
		return countOfPrime; 
	}
}

class Solution {
	public static void main(String args[]) {
		
		CountPrime obj = new CountPrime();
		Scanner sc = new Scanner(System.in);
		int s = sc.nextInt();
		int e = sc.nextInt();
		System.out.println(obj.totalPrime(s, e));
	}
}
		
			
