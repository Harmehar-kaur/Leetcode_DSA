import java.util.Scanner;

class insertionDeletion {
    public static void insert(int[] arr) {
        int n = arr.length;
        try (Scanner s = new Scanner(System.in)) {
            System.out.println("Enter the position of the element and element to be added in the same order ");
            int pos = s.nextInt();
            int ele = s.nextInt();

            if (pos <= n && pos >= 0) {
                for (int i = n; i >= pos; i--) {
                    arr[i] = arr[i - 1];
                }
                arr[pos] = ele;
                System.out.println("New Array: ");
                for (int i = 0; i < n-1; i++) {
                    System.out.println(arr[i]);
                }
            } else {
                System.err.println("The position entered is invalid");
            }
        }

    }

    public static void delete(int[] arr, int n){
        try (Scanner read = new Scanner(System.in)) {
            System.out.println("Enter the element to be deleted: ");
            int eleDelete = read.nextInt();
            int pos=-1; 
            for(int i=0;i<n;i++){
                if(arr[i]==eleDelete){
                    pos=i; 
                    break; 
                }
            }
            if(pos != -1){
                for(int i=pos; i<n;i++){
                    arr[i]=arr[i+1]; 
                }
                System.out.println("New Array: ");
                for(int i=0;i<arr.length;i++){
                    System.out.println(arr[i]);
                }
            }else{
                System.out.println("Element not found");
            }
        }
    }

    public static void main(String[] args) {
        try (Scanner m = new Scanner(System.in)) {
            System.out.println("Enter the size of the array: ");
            int n = m.nextInt(); 
            int[] arr=new int[n];

            for(int i=0;i<n;i++){
                System.out.println("Enter "+i+"th element"); 
                arr[i]=m.nextInt(); 
            }
            insert(arr);
            delete(arr, n);
        } 

    }
}