package methods;
import java.util.*;
public class EvenOdd_meth {
	boolean evenorodd(int n) {
		if(n%2==0) {
			return true;
		}
		return false;
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a value:");
		int n=sc.nextInt();
		EvenOdd_meth num=new EvenOdd_meth();
		System.out.println(num.evenorodd(n)?"It is even":"It is odd");
	}
	}

