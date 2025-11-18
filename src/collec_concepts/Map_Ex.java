package collec_concepts;
import java.util.*;
public class Map_Ex {
	public static void main(String[] args) {
		Map<Integer,String> m =new HashMap<>();
		m.put(3, "is");
		m.put(0, "A");
		m.put(1, "place");
		m.put(1, "palace");
		m.put(2, "google");
		System.out.println(m);
		System.out.println(m.size());
		System.out.println(m.isEmpty());
		System.out.println("==="+m.containsKey(1));
		System.out.println(m.containsValue("place")+"---");
	}
}
