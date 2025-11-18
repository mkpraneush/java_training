package home_work;
import java.util.*;
public class Kth_Largest {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        System.out.print("Enter number of elements: ");
	        int n = sc.nextInt();
	        int arr[] = new int[n];
	        System.out.println("Enter " + n + " values:");
	        for (int i = 0; i < n; i++) {
	            arr[i] = sc.nextInt();
	        }

	        System.out.print("Enter value of k: ");
	        int k = sc.nextInt();

	        // Sort the array in ascending order
	        Arrays.sort(arr);

	        // k-th largest means (n - k)th index after sorting ascending
	        if (k <= n && k > 0) {
	            int kthLargest = arr[n - k];
	            System.out.println("The " + k + "-th largest element is: " + kthLargest);
	        } else {
	            System.out.println("Invalid value of k!");
	        }
	    }
	}

