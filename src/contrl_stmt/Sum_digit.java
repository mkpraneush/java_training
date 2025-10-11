package contrl_stmt;

public class Sum_digit {
	public static void main(String[] args) {
		int num=3223;
		int sum=0;
		while(num!=0) {
			int last=num%10;
			sum+=last;
			num/=10;
		}
		System.out.println(sum);
	}

}
