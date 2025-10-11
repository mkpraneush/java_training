package contrl_stmt;

public class Prime_break {
	public static void main(String[] args) {
		int num=10;
		boolean flag=true;
		for(int i=2;i<=num/2;i++) {
			if(num%i==0) {
				flag=false;
				break;
			}
		}
		if (flag) {
			System.out.println(num);
		}
		else
			System.out.println("is not prime");	
	}

}
