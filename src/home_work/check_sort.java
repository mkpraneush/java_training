package home_work;
import java.util.*;

public class check_sort {
	public static void main(String[] args) {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter a number:");
		int n=scan.nextInt();
		int arr[]=new int [n];
		for (int i=0;i<arr.length;i++) {
			arr[i]=scan.nextInt();
		}
		for(int i=0;i<arr.length-1;i++) {
			if(arr[i]>arr[i+1]) {
				System.out.println("not sort");
				break;
				
			}
			
		}
		System.out.println("sort");
	}

}
