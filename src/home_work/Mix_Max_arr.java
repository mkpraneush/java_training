package home_work;
import java.util.Arrays;
import java.util.Scanner;
public class Mix_Max_arr {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int arr[] = new int[10];
	        System.out.println("Enter 10 values: ");
	        for (int i = 0; i < arr.length; i++) {
	            arr[i] = sc.nextInt();
	        }
	        System.out.println("Array elements: " + Arrays.toString(arr));
	        int max=arr[0]; // start with the first element
	        int min=arr[0];
	        //prints max value in an array
	        for (int i = 1; i < arr.length; i++) {
	            if (arr[i] > max) {
	                max = arr[i];
	            }
	            //prints minimum number
	            if(arr[i]<min) {
	     		   min = arr[i];
	     	   }
	        }
	        System.out.println("Maximum number in the array: " + max);
	        System.out.println("Minimum number in the array: "+min);
	        sc.close();
	    }
	}
	


