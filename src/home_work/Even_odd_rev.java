package home_work;
import java.util.Scanner;
import java.util.Arrays;

public class Even_odd_rev {
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int arr[]=new int[7];
			System.out.println("Enter the values for an array");
			for(int i=0;i<arr.length;i++) {
				arr[i]=sc.nextInt();
			}
			System.out.println(Arrays.toString(arr));
			System.out.println("Reversed order:");
			for(int i=arr.length-1;i>=0;i--) {
				System.out.print(arr[i]+" ");
				
				}
			//in reverse order(Even indexing)
			System.out.println("\n\nNumbers at even index positions are:");
	        for (int i = 0; i < arr.length; i++) {
	            if (i % 2 == 0) {
	                System.out.print(arr [i] + " ");
	            }
	        }
	        //in reverse order(odd indexing)
	        System.out.println("\n\nNumbers at odd index positions are:");
	        for (int i = 0; i < arr.length; i++) {
	            if (i % 2 != 0) {
	                System.out.print(arr[i] + " ");
	            }
	        }
				}
		}

