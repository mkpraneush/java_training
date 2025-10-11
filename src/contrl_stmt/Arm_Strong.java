package contrl_stmt;
import java.util.*;
public class Arm_Strong {
		public static void main(String[] args) {
			Scanner scan=new Scanner(System.in);
			System.out.println("Enter a number:");
			int n=scan.nextInt();
			int temp=n,rem,sum=0,dig=0;
			int num=n;
			while(num!=0){
				num/=10;
				dig++;
				
			}
			num=n;
			while(num!=0)
			{
			rem=num%10;
			int pow=1;
			for(int i=0;i<dig;i++)
			{
				pow*=rem;
			}
			sum+=pow;
			num/=10;
			}
			if(sum==temp)
			{
				System.out.println(temp+ " is an armstrong number");
			}
			else
			{
			System.out.println(temp+ " is not ");
			}
		}

	}

