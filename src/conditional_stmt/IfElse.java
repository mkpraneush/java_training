package conditional_stmt;

public class IfElse {
	public static void main(String[] args) {
		int mark= 80;
		if(mark>49) {
			System.out.println("Pass");
		}
		else {
			System.out.println("Fail");
		}

		if(mark%2==0) {
			System.out.println("even");
		}
		else
		{
			System.out.println("odd");
		}
	}

}
