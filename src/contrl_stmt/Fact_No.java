package contrl_stmt;

public class Fact_No {
	public static void main(String[] args) {
		int n=5;
		int fact=1;
		int sum=0;
		for(int i=1;i<=5;i++) {
			fact*=i; //factorial of a number
			sum+=i;//sum n of number
		}
		System.out.println(fact);
		System.out.println(sum);
	}

}
