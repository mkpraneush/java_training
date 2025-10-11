package contrl_stmt;

public class Perfect {
	public static void main(String[] args) {
		int n=6,res=0;
		for(int i=1;i<n;i++) {
			if(n%i==0) {
				res+=i;
			}
		}
		if(res==n) {
			System.out.println("perfect");
		}
		else
			System.out.println("Not perfect");
		
	}
}
