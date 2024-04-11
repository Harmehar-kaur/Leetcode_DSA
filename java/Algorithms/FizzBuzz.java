package Algorithms;

import java.util.Scanner;

public class FizzBuzz {
    public static void main(String[] args) {
        try (Scanner s = new Scanner(System.in)) {
            int n = s.nextInt();
            int[] arr = new int[n];
            for (int i = 0; i < arr.length; i++) {
                arr[i] = s.nextInt();
            }
            for (int i = 0; i < n; i++) {
                if (arr[i] % 3 == 0 && arr[i] % 5 == 0) {
                    System.out.println(arr[i] + " fizz buzz");
                } else if (arr[i] % 3 == 0) {
                    System.out.println(arr[i] + " fizz");
                } else if (arr[i] % 5 == 0) {
                    System.out.println(arr[i]+ " buzz");
                } else {
                    System.out.println(arr[i]);
                }
            }
        }
    }

}
