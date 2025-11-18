package collec_concepts;
import java.util.*;
public class Queue_ex {
public static void main(String[] args) {
	Queue <String> q=new LinkedList<>();
	q.add("Praneush");
	q.add("Na ");
	q.add("Gethu");
	q.add("Mass uh");
	q.add("Palani ");
	q.add("Waste uh ");
	System.out.println(q);
	System.out.println(q.poll());//delete  
	System.out.println(q.peek());// top of the element
	System.out.println(q.size());
	System.out.println(q.isEmpty());
	q.clear();
	System.out.println(q);
}
}
