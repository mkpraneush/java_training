package home_work;
import java.util.*;
public class Arr_Rotation {

		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int arr[]=new int[5];
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter the values:");
				arr[i]=sc.nextInt();
			}
			System.out.println(Arrays.toString(arr));
			// Rotate right by one position
	        int last = arr[arr.length - 1];
	        for(int i = arr.length - 1; i > 0; i--) {
	            arr[i] = arr[i - 1];
	        }
	        arr[0] = last;

	        System.out.println("Array after rotation:");
	        System.out.println(Arrays.toString(arr));
		}
	}

