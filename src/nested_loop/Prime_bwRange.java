package nested_loop;
import java.util.*;
public class Prime_bwRange {
	public static void main(String[]args) {
		Scanner sc=new Scanner(System.in);
		int num =sc.nextInt();
	    int c=0;
		for(int i=1;i<=num;i++) {
		if(num%i==0) {
			c++;
		}
		}
		if(c==2) {
			System.out.println(num);
		}
	}
}