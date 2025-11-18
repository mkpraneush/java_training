package collec_concepts;
import java.util.*;
public class Stack_Example {
	public static void main(String[] args) {
		Stack <Integer> st =new Stack<>();
		System.out.println(st.capacity());
		
		st.push(90);
		st.push(9);
		st.push(0);
		st.push(1140);
		System.out.println(st);
		System.out.println(st.pop());
		System.out.println(st.peek());
		System.out.println(st);
		System.out.println(st.size());
		System.out.println(st.isEmpty());
		System.out.println(st.capacity());
	}

}
