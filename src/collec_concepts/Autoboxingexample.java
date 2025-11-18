package collec_concepts;
import java.util.*;
public class Autoboxingexample {
	public static void main(String[] args) {
		// Autoboxing
		int num=10255;
		Integer nu=Integer.valueOf(num);
		Integer n = num;
		
		//unboxing
		Integer no=2565;
		int op=no.intValue();
		int o=no;
		
		//non premiitve to non primitive
		//integer to String
		Integer no1=7418;
		String str1=String.valueOf(no1);
		
		//String to integer
		String st= "745698";
		Integer res=Integer.parseInt(st);


			ArrayList<Integer> al=new ArrayList<>();

			al.add(1);

			al.add(2);

			al.add(3);

			al.add(4);

			al.add(1);

			System.out.println(al);

			System.out.println(al.size());

			System.out.println(al.get(2));

			al.set(2, 10);

			System.out.println(al);

			al.remove(3);

			System.out.println(al);

			for(int i=0;i<al.size();i++) {

				System.out.println(al.get(i));

			}

			for(int i:al) {

				System.out.println(i);

			}

		
	} 

}
