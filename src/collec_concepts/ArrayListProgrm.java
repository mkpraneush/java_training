package collec_concepts;
import java.util.*;

public class ArrayListProgrm {
	public static void main(String[] args) {
		ArrayList <Integer> al =new ArrayList<>();
		al.add(1);
		al.add(2);
		al.add(3);
		al.add(4);
		al.add(5);
		al.add(6);
		System.out.println(al);
		System.out.println(al.size());
		System.out.println(al.get(2));
		al.set(2, 10);
		System.out.println(al);
		al.remove(3);
		System.out.println(al);
	}

}
