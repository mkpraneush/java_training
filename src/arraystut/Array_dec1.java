package arraystut;
import java.util.*;
public class Array_dec1 {
	public static void main(String[] args) {
		String arr[]={"tttch","palani","naa","saffu","ava"};
		Scanner yep=new Scanner(System.in);
		int sum=0,max=0;
		float avg=0;
		int num[]=new int[5];
		for(int i = 0;i<arr.length;i++) {
			num[i]=yep.nextInt();
			
			sum+=num[i];
			avg=sum/arr.length;
		}
		System.out.println(sum);
		System.out.println(avg);

		
}
}