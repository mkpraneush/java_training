package contrl_stmt;

public class Factors {
	public static void main(String[] args) {
		int n =13, c =0;
		for(int i=1;i<=n;i++) {
			if(n%i==0) {
				System.out.println(i);
				c++;
			}
		}
		
	}
}
