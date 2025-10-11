package opertors;
import java.util.*;
public class Ternary {
	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the mark");
		int num =sc.nextInt();
		
		String res=(num>49)? "pass": "fail";
		String op=(num>=0&&num<=100)? ((num>49)?"pass" :"fail"):"Invalid mark";
		System.out.println(res);
		System.out.println(op);
	}

}
