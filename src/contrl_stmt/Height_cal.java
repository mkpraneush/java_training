package contrl_stmt;

public class Height_cal {
	public static void main(String []args) {
		int num=26513;
		int max=0;
		while(num>0) {
			if(max<num%10) {
				max=num%10;
		}
			num=num/10;
	}
		System.out.println(max);
		
		int min=0;
		while(num>0) {
			if(min<num%10) {
				min=num%10;
			}
			num=num/10;
		}
		System.out.println(min);
}
	
}


