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
