package contrl_stmt;
import java.util.*;
public class Spy_number {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		int n=sc.nextInt();
		int digit;
				int sum=0,pro=1;
				while(n>0)
				{
					digit=n%10;
					sum+=digit;
					pro*=digit;
					n=n/10;
					
				}
				if(sum==pro)
				{
					System.out.println("It is a spy number");
				}
				else
				{
					System.out.println("It is not a spy number");
				}
			}

		
	
}