package basics;
public class Typecasting {
	public static void main(String[] args) {
		//implicit
		char ch ='A';
		int val=(int)'s';
		int op=ch;
		System.out.println(val);
		System.out.println(op);
		System.out.println();
		//explicit
		float f1=34.98f;
		int i1=(int)f1;
		System.out.println(i1);
		System.out.println();
		//small to cap
		char io='d';
		System.out.println((char)(io-32));
		//cap to small
		char oi='D';
		System.out.println((char)(oi+32));
		//here the output will be in the byte 
		byte n1=30,n2=70;
		byte res=(byte)(n1+n2);
		System.out.println(res);
		
		}

}
