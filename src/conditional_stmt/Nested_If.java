package conditional_stmt;
import java.util.*;
public class Nested_If {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the mark=");
		int mark=sc.nextInt();
		//nest if
		if (mark>=0&&mark<=100) {
			if(mark<35) {
				System.out.println("fail");
			}
			else if(mark>=35&&mark<50) {
				System.out.println("average");
			}
			else if(mark>=50&&mark<85) {
				System.out.println("Good");
			}
			else {
				System.out.println("Excellent");
			}
		}
		else {
			System.out.println("Invalid");
		}
	}
}