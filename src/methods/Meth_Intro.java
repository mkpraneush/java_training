package methods;
import java.util.Scanner;
public class Meth_Intro {
		void pk() {
			Scanner sc=new Scanner(System.in);
			int a=sc.nextInt();
			int b=sc.nextInt();
			int res=a+b;
			System.out.println(res);
		}
		public static void main(String[] args) {
			Meth_Intro me=new Meth_Intro();
			System.out.println("Meth calling 1");
			me.pk();//method calling part
			System.out.println("Meth return 1");
			System.out.println("Meth calling 2");
			me.pk();//method calling part
			System.out.println("Meth return 2");
			System.out.println("Meth calling 3");
			me.pk();//method calling part
			System.out.println("Meth return 3");
				}
	}

