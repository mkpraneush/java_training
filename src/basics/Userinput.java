package basics;
import java.util.Scanner;
public class Userinput {
	public static void main(String[] args) {
		Scanner sc =new Scanner (System.in);
		System.out.println("enter the number:");
		int num = sc.nextInt();
		System.out.println("Value "+num);
		char ch = sc.next().charAt(1);
		System.out.println(ch);
	}
}
