package basics;

public class Variable {
	int insVar=65;   //instance variable scope for entire class
	void meth() {
	int locVar=90;   //local variable scope up to this segment
	System.out.println(locVar);
	System.out.println(insVar);
	}
	void disp() {
	int locVar=100;
	System.out.println(locVar); // can't access since it is local variable of above method
	System.out.println(insVar);
	}
	public static void main(String[] args) {
	Variable obj1; //obj1 declaration "inga cls ku object create panichu "
	obj1=new Variable();  //memory allocation "adha object ku memory alloacte panra"
	System.out.println(obj1);// adha print panra
	Variable obj2=new Variable();
	System.out.println(obj2);
	obj1.meth();
	obj2.disp();
	}

	}
