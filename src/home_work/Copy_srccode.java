package home_work;
import java.util.*;
public class Copy_srccode  {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int arr[]=new int[7];
		for(int i=0;i<arr.length;i++) {
			System.out.println("Enter the values:");
			arr[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(arr));
		int des[]=new int[7];
		for(int i=0;i<arr.length;i++) {
			des[i]=arr[i];
		}
		System.out.println("Copied array is: ");
		System.out.println(Arrays.toString(des));
	}
}

