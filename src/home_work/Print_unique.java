package home_work;
import java.util.*;
public class Print_unique {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int arr[] = new int[10];
	        System.out.println("Enter 10 values:");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }

	        // Bubble sort
	        boolean flag = true;
	        while (flag) {
	            flag = false;
	            for (int i = 0; i < arr.length - 1; i++) {
	                if (arr[i] > arr[i + 1]) {
	                    int temp = arr[i];
	                    arr[i] = arr[i + 1];
	                    arr[i + 1] = temp;
	                    flag = true;
	                }
	            }
	        }

	        System.out.println("Sorted array: " + Arrays.toString(arr));

	        // Find duplicates and unique elements
	        System.out.print("Distinct elements: ");
	        for (int i = 0; i < arr.length; i++) {
	            // print only when it's not same as previous
	            if (i == 0 || arr[i] != arr[i - 1]) {
	                System.out.print(arr[i] + " ");
	            }
	        }

	        System.out.print("\nDuplicate elements: ");
	        boolean hasDuplicate = false;
	        for (int i = 0; i < arr.length - 1; i++) {
	            if (arr[i] == arr[i + 1]) {
	                System.out.print(arr[i] + " ");
	                hasDuplicate = true;
	                // skip next duplicate to avoid repeat print
	                while (i < arr.length - 1 && arr[i] == arr[i + 1]) i++;
	            }
	        }
	        if (!hasDuplicate) System.out.print("None");

	        System.out.print("\nUnique elements: ");
	        boolean hasUnique = false;
	        for (int i = 0; i < arr.length; i++) {
	            boolean isUnique = true;
	            for (int j = 0; j < arr.length; j++) {
	                if (i != j && arr[i] == arr[j]) {
	                    isUnique = false;
	                    break;
	                }
	            }
	            if (isUnique) {
	                System.out.print(arr[i] + " ");
	                hasUnique = true;
	            }
	        }
	        if (!hasUnique) System.out.print("None");
	    }
	
}
