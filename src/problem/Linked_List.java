package problem;
import java.util.*;
public class Linked_List {
public static void main(String[] args) {
	LinkedList <Integer> st= new LinkedList<>();
	st.add(78);
	st.add(0);
	st.add(8);
	st.add(8);
	System.out.println(st);
	
	Collections.sort(st);
	System.out.println(st);
	System.out.println(st.contains(7));//check the element inside the arr
	System.out.println(st.isEmpty());//if it empty or not
	//st.clear();// to clear all element
	//System.out.println(st);// inside the sop can't run "clear"
	//st.removeFirst();
	//System.out.println(st);
	st.removeFirstOccurrence(8);
	System.out.println(st);
	st.removeLastOccurrence(8);
	System.out.println(st);
	System.out.println(st.indexOf(78));
	
	}
}
