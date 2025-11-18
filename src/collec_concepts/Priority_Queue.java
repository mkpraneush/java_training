package collec_concepts;
import java.util.*;//Queue;
public class Priority_Queue {
	public static void main(String[] args) {
		Queue <Character> q=new PriorityQueue<>();
		Queue <Character> pq=new PriorityQueue<>(Comparator.comparingInt((Character x) -> x).reversed());
		q.add('x');
		q.add('1');
		q.add('h');
		q.add('a');
		pq.add('x');
		pq.add('1');
		pq.add('h');
		pq.add('a');
		System.out.println(q);
		System.out.println(q.poll());
		System.out.println(q.poll());
		System.out.println();
		System.out.println(pq.poll());
		System.out.println(pq.poll());
	}
}
