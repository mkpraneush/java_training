package methods;
import java.util.*;
public class Met_clas {
	Scanner sc =new Scanner (System.in);
	//method declaration or definition part
	//without return type without Parameter
	void kavin() {
		int a=sc.nextInt();
		int b=sc.nextInt();
		int res=a+b;
		System.out.println(res);
	}
	 //with return type without Parameter
	float santhosh() {
		int a=sc.nextInt();
		int b=sc.nextInt();
		return a*b;
	}
	//without return type with Parameter
	void vishnu(int a,int b) {
		if(a<b) {
			System.out.println("input 1 is smaller that input 2");
			return;
		}
		System.out.println(a-b);
	}
	//with return type with Parameter
	String concatination(String s1,String s2,String s3) {
		return s1+" "+s2+" "+s3;
	}
	public static void main(String[] args) {
		Met_clas ob1=new Met_clas();
		ob1.kavin();  //method calling part
		float res=ob1.santhosh();
		System.out.println(res);  //method calling part
		int a=10;
		int b=29;
		ob1.vishnu(a,b);  //method calling part
		ob1.vishnu(20,a);  //method calling part
		System.out.println(ob1.concatination("Velalar","Engineering","College"));

	}}