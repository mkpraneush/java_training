package home_work;
import java.util.*;
public class Arr_rev {
	public static void main(String[] args) {
		Scanner sc=new Scanner (System.in);
		int num[]=new int [10];
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}
		System.out.println(Arrays.toString(num));
		System.out.println("reversed order:");
		for(int i=num.length-1;i>=0;i--) {
			System.out.print(num[i]+" ");
		}
		
	}
}
