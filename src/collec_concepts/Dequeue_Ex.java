package collec_concepts;
import java.util.*;
public class Dequeue_Ex {
	public static void main(String[] args) {
		Deque<Integer> dq=new ArrayDeque<>();
		Queue<Integer> lq=new LinkedList<>();
		lq.offer(34);
		lq.offer(889);
		lq.offer(82);
		lq.offer(71);
		lq.offer(17);
		lq.offer(10);
		System.out.println(lq);
		System.out.println(lq.poll());
		dq.offer(1);
		dq.offer(1);
		dq.offer(1);
		dq.offer(1);
		System.out.println(dq);
		dq.offerFirst(23);//this offer is not for queue
		System.out.println(dq);
		dq.pollLast();
		System.out.println(dq);
	}
}
