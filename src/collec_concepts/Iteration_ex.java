package collec_concepts;
import java.util.*;
public class Iteration_ex {
	public static void main(String[] args) {
		ArrayList <Integer > io= new ArrayList<>();
		io.add(56);
		io.add(65);
		io.add(12);
		io.add(07);
		io.add(4);
		System.out.println(io);
		Iterator <Integer>it =io.iterator();
		while(it.hasNext()) {
			System.out.println(it.next());
		}
	}
}
