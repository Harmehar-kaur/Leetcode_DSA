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
		
			
//complex numbers class 
import java.util.Scanner;

class ComplexNumbers {
	
	int real, imaginary; 

	public ComplexNumbers(int real, int imaginary){
		this.real = real;
		this.imaginary = imaginary;
	}

	public void plus(ComplexNumbers C2){
		this.real += C2.real; 
		this.imaginary += C2.imaginary; 
		print(this.real, this.imaginary);
	}

	public void multiply(ComplexNumbers C2){
		int newReal = this.real * C2.real - this.imaginary * C2.imaginary;
		int newImaginary = this.real * C2.imaginary + this.imaginary * C2.real;
		print(newReal, newImaginary);
	}

	public void print(int real, int imaginary){
		System.out.println(real + " + i" + imaginary);
	}
}

class Solution {
	
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		
		// Input
		int real1 = sc.nextInt();
		int imaginary1 = sc.nextInt();
		int real2 = sc.nextInt();
		int imaginary2 = sc.nextInt();
		int operation = sc.nextInt();
		
		// Creating complex numbers
		ComplexNumbers c1 = new ComplexNumbers(real1, imaginary1);
		ComplexNumbers c2 = new ComplexNumbers(real2, imaginary2);

		// Performing operations based on input
		if (operation == 1) {
			c1.plus(c2);
		} else if (operation == 2) {
			c1.multiply(c2);
		}
	}
}

//person and age
import java.util.Scanner;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void printDetails() {
        System.out.println("The name of the person is " + name + " and the age is " + age + ".");
    }
}

class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        // Input
        String name = sc.nextLine();
        int age = sc.nextInt();

        // Creating a Person object
        Person person = new Person(name, age);

        // Printing details
        person.printDetails();
    }
}

//area of rectangle

import java.util.Scanner;

class Rectangle {
    int length;
    int breadth;

    public int getArea() {
        return length * breadth;
    }
}

//count words 
import java.util.* ;
import java.io.*; 
import java.util.Scanner;
class Solution {
	
    static int  countWords(String input) {
        // Write your code here
        String[] words = input.split(" "); // Split the input string by spaces
        return words.length;
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        int output = countWords(input);
        System.out.println(output);
		
	}
}
//all substrings 

from os import *
from sys import *
from collections import *
from math import *




def printSubstrings(input_string) :

    #Your code goes here.
    substrings = []

    # Generate all possible substrings
    for start in range(len(input_string)):
        for length in range(1, len(input_string) - start + 1):
            substrings.append(input_string[start:start+length])

    # Sort substrings based on starting index and length
    substrings.sort(key=lambda x: (len(x), x))

    return substrings
           
#main
string = input();
output = printSubstrings(string)
for substr in output:
    print(substr)

// reverse string word wise 
import java.util.Scanner;

class Solution {

    static String reverseStringWordWise(String input) {
        // Split the input string into words
        String[] words = input.split(" ");
        
        // Create a StringBuilder to build the reversed sentence
        StringBuilder reversed = new StringBuilder();
        
        // Iterate through the words in reverse order and append to the StringBuilder
        for (int i = words.length - 1; i >= 0; i--) {
            reversed.append(words[i]);
            if (i > 0) {
                reversed.append(" "); // Add space between words
            }
        }
        
        return reversed.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseStringWordWise(input);
        System.out.println(ans);
    }
}
//check permutation

import java.util.*;

class Solution {
	
    static boolean isPermutation(String str1, String str2) {
        // Check if the lengths of both strings are equal
        if (str1.length() != str2.length()) {
            return false;
        }
        
        // Create arrays to count the frequency of characters
        int[] charCount = new int[26]; // Assuming only lowercase letters
        
        // Count the characters in the first string
        for (char c : str1.toCharArray()) {
            charCount[c - 'a']++;
        }
        
        // Subtract the characters in the second string
        for (char c : str2.toCharArray()) {
            charCount[c - 'a']--;
        }
        
        // Check if all counts are zero
        for (int count : charCount) {
            if (count != 0) {
                return false;
            }
        }
        
        return true;
    }
    
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
        String input1 = sc.nextLine();
        String input2 = sc.nextLine();
        boolean answer = isPermutation(input1, input2);
        if (answer) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
	}
}
//remove consecutive duplicates 
import java.util.*;

class Solution {

    static String removeConsecutiveDuplicates(String input) {
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < input.length(); i++) {
            char currentChar = input.charAt(i);

            // Append the current character to the result if it's the first occurrence or if it's different from the previous character
            if (i == 0 || currentChar != input.charAt(i - 1)) {
                result.append(currentChar);
            }
        }

        return result.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        String ans = removeConsecutiveDuplicates(input);
        System.out.println(ans);
    }
}
//reverse each word 
import java.util.*;

class Solution {

    static String reverseEachWord(String input) {
        StringBuilder result = new StringBuilder();
        StringBuilder word = new StringBuilder();

        for (char c : input.toCharArray()) {
            if (c == ' ') {
                // If a space is encountered, reverse the current word and append to the result
                word.reverse();
                result.append(word).append(" ");
                word.setLength(0); // Clear the word buffer
            } else {
                word.append(c); // Add characters to the current word buffer
            }
        }

        // Reverse and append the last word (no space after the last word)
        word.reverse();
        result.append(word);

        return result.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        String ans = reverseEachWord(input);
        System.out.println(ans);
    }
}
//remove character

import java.util.*;

class Solution {

    static String removeAllOccurrencesOfChar(String input, char c) {
        StringBuilder result = new StringBuilder();

        for (char ch : input.toCharArray()) {
            if (ch != c) {
                result.append(ch);
            }
        }

        return result.toString();
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String input = sc.next();
        char c = sc.next().charAt(0);
        String ans = removeAllOccurrencesOfChar(input, c);
        System.out.println(ans);
    }
}
//first index
import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // no. of elements
        int arr[] = new int[n];
        // initializing array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt(); // element whose index to be searched
        firstIndex(arr, n, x);
    }

    // Function for finding first occurrence
    static void firstIndex(int[] arr, int n, int x) {
        int first = -1;
        for (int i = 0; i < n; i++) {
            if (x == arr[i]) {
                first = i;
                break;
            }
        }

        System.out.println(first);
    }

}
//Last index element
import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements
        int arr[] = new int[n];
        // Initializing array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int x = sc.nextInt(); // Element whose index to be searched
        lastIndex(arr, n, x);
    }

    // Function for finding last occurrence
    static void lastIndex(int[] arr, int n, int x) {
        int last = -1;
        for (int i = n - 1; i >= 0; i--) {
            if (x == arr[i]) {
                last = i;
                break;
            }

        }
        System.out.println(last);
    }

}

//reverse an array 
import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements
        int arr[] = new int[n];
        // Initializing array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        reverseArray(arr, 0, n - 1, n);
    }

    // Function to reverse array
    static void reverseArray(int arr[], int start, int end, int size) {
        while (start < end) {
            int temp = arr[start];
            arr[start] = arr[end];
            arr[end] = temp;
            start++;
            end--;
        }

        for (int i = 0; i < size; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

//rotate an array 
import java.util.Scanner;

class Solution {

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt(); // number of elements
        int arr[] = new int[n];
        // Initializing array elements
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int k = sc.nextInt(); // No. of times to rotate
        rotateArray(arr, n, k);
    }

    static void rotateArray(int arr[], int n, int k) {
        // storing 1st k elements in temporary array
        int temp[] = new int[k];
        for (int i = 0; i < k; i++) {
            temp[i] = arr[i];
        }
        // shifting remaining elements of the array
    
        for (int i = k; i < n; i++) {
            arr[i - k] = arr[i];
        }
    
        //storing back the k elements to the orignal array
        for (int i = 0; i < k; i++) {
            arr[n - k + i] = temp[i];
        }
        //printing array
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
    }

}

//kth smallest/largest element 

import java.util.Arrays;
import java.util.Scanner;

class Solution {

	static void kthSmallestLargest(int arr[], int n, int k) {
		Arrays.sort(arr);
		// kthlargest
		int z = n - 1;
		int mn = Integer.MAX_VALUE;
		int count = 0;
		int flag = 0;

		while (z >= 0) {

			if (arr[z] < mn) {
				mn = arr[z];
				count++;
			}
			if (count == k) {
				flag = 1;
				System.out.print(arr[z] + " ");
				break;
			}

			z--;
		}
		if (flag == 0) {
			System.out.print("-1 ");
		}

		// kthSmallest
		count = 0;
		mn = Integer.MIN_VALUE;
		flag = 0;

		for (int i = 0; i < n; i++) {

			if (arr[i] > mn) {
				mn = arr[i];
				count++;
			}
			if (count == k) {
				flag = 1;
				System.out.println(arr[i]);
				break;
			}
		}
		if (flag == 0) {
			System.out.println(-1);
		}
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while (t > 0) {
			int n = sc.nextInt();
			int k = sc.nextInt();

			int arr[] = new int[n];
			for (int i = 0; i < n; i++) {
				arr[i] = sc.nextInt();
			}
			kthSmallestLargest(arr, n, k);
			t--;
		}
	}
}

//sort012
import java.util.Scanner;

class Solution {

	static void sort012(int arr[], int n) {
		 // Taking two pointer one at begining and other at the end of array.
		 int low = 0;
		 int high = n - 1;
		 int i = 0;
	 
		 while (i <= high) {
	 
			 // if arr[i] is equal to 0
			 if (arr[i] == 0) {
				 int t;
				 t = arr[low];
				 arr[low] = arr[i];
				 arr[i] = t;
				 low++;
				 i++;
			 } else if (arr[i] == 2) {
				 int t;
				 t = arr[high];
				 arr[high] = arr[i];
				 arr[i] = t;
				 high--;
			 }
			 // if arr[i] is not equal to 0 and 2.
			 else {
				i++;
			 }	 
		 }
	}

	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		StringBuilder sb = new StringBuilder();
		while (t > 0) {
			int n = sc.nextInt();
			int arr[] = new int[n];
			for (int i = 0 ; i < n ; i++) {
				arr[i] = sc.nextInt();
			}
			sort012(arr, n);
			for (int i = 0 ; i < n; i++) {
				sb.append(arr[i] + " ");
			}
			sb.append('\n');;
			t--;
		}
		System.out.println(sb);
	}
}
