package collec_concepts;
import java.util.*;
public class Map_ex1 {
	public static void main(String[] args) {
		LinkedHashMap <Character,Integer> q = new LinkedHashMap<>();
		q.put('t', 0);
		q.put('h', 1);
		q.put('a', 2);
		q.put('y', 3);
		q.put('o', 4);
		q.put('l', 5);
		q.put('i', 6);
		System.out.println(q);
		System.out.println(q.size());
		System.out.println(q);
		for(char ch : q.keySet()) {
			System.out.println(ch+" : "+q.get(ch));
		}
		for(int i :q.values()) {
			System.out.println(i);
		}
		for(Map.Entry<Character,Integer>it : q.entrySet()) {
			System.out.println(it.getValue()+" : "+it.getValue());
		}
	}

}
