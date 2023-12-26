// import java.util.Arrays;
// import java.util.Scanner;

// class ArraySort {
//     public ArraySort() {
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter how many numbers in the array");
//         int n = sc.nextInt();
//         int arr[] = new int[n];
//         for (int i = 0; i < arr.length; i++) {
//             arr[i] = sc.nextInt();
//         }
//         Arrays.sort(arr); // Use Arrays.sort to sort the array

//         System.out.println("Sorted array: " + Arrays.toString(arr));
//     }

//     public static void main(String[] args) {
//         ArraySort arraySort = new ArraySort(); // Create an object of ArraySort to invoke the constructor
//     }
// }

import java.util.Arrays;
import java.util.Scanner;

public class ArraySort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of array elements");
        int n = sc.nextInt();
        int arr[] = new int[n]; 
        for (int i = 0; i < arr.length; i++) {
            arr[i]=sc.nextInt();
        }
        Arrays.sort(arr);
        System.out.println("Sorted array is"+Arrays.toString(arr));
        sc.close();
    }
}