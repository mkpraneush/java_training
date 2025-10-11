package contrl_stmt;

public class Palindrome {
	public static void main(String[] args) {
		int num=67;
		int temp=num;
		int sum=0;
		while(num!=0) {
			int last=num%10;
			sum=(sum*10)+last;
			num/=10;
		}
		if(temp==sum) {
			System.out.println("Palindrome");
		}
		else
			System.out.println("Not Palin");
	
		
	}
}
