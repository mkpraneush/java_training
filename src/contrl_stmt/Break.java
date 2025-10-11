package contrl_stmt;

public class Break {
	public static void main(String[] args) {
		System.out.println("break");
		for(int i=1;i<=10;i++) {
			if(i==5) {
				break;
			}
			System.out.println(i);
		}
		System.out.println("Continue");
		for(int i=1;i<=12;i++) {
			if(i==5) {
				continue;
			}
			System.out.println(i);
		}
	}

}
