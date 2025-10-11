package contrl_stmt;

public class Reverse {
	public static void main(String[] args) {
		int num=67;
		int sum=0;
		while(num!=0) {
			int last=num%10;
			sum=(sum*10)+last;
			num/=10;
		}
		System.out.println(sum);
	
		
	}
}
