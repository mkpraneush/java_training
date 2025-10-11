package basics;

public class Staticvariable {
	int num=1;  //instance
	static int num1=1;  //static refers unique memory for entire class
	void disp() {
		num1++;// static can't use in local variable
		num++;
		System.out.println("Ins " +num);
		System.out.println("Static "+num1);
	}
	public static void main(String[] args) {
		Staticvariable s1=new Staticvariable();
		Staticvariable s2=new Staticvariable();
		Staticvariable s3=new Staticvariable();
		s1.disp();
		s2.disp();
		s3.disp();

	}
}