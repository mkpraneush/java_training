package problem;
import java.util.*;
public class Arr_List {
	public static void main(String[] args) {
		Scanner scan = new Scanner (System.in);
		ArrayList<Integer> s1 = new ArrayList<>();
		s1.add(3);
		s1.add(4);
		s1.add(8);
		s1.add(9);
		
		int n=s1.size();
		if(s1.isEmpty()) {
			for(int i=0;i<4;i++) {
				int a =scan.nextInt();
				s1.add(a);
				}
			System.out.print(s1);
		}else if(n%2==0) {
			for(int i=0;i<n;i++) {
				int a =scan.nextInt();
				s1.add(a);
			}
			System.out.print(s1);
		}
		else {
			System.out.println(s1);
		}
}
}
