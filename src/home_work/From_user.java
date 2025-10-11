package home_work;
import java.util.*;
public class From_user {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int [] arr= new int[5];
		System.out.println("The elements in the array are:");
		for(int i=0;i<arr.length;i++) {
			arr[i]=sc.nextInt();
		}
			
		System.out.println(Arrays.toString(arr));
		}
	}
	
		

