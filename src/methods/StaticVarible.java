package methods;

public class StaticVarible {
	void sum(float num1,int num2) {
		System.out.println(num1+num2);
	}
	void sum(int num1,float num2) {
		System.out.println(num1+num2);
	}
	void sum(int num1,int num2,int num3) {
		System.out.println(num1+num2+num3);
	}
	public static void main(String[] args) {
		StaticVarible sv =new 	StaticVarible();
		sv.sum(2.0f, 1);
		sv.sum(1, 2.0f);
		sv.sum(2.0f, 1);
	//	sv.sum(1, 1);// these line can't choose the exception of ambiguity
		
		
	}
}
