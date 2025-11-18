package stringconpct;

public class String_Buffer {
	public static void main(String[] args) {
		String st1="Kavin";
		StringBuffer sb=new StringBuffer();// no different from the StringBuilder same in capacity 
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append(st1);
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.append("kumar is a good boy");
		System.out.println(sb);
		System.out.println(sb.capacity());
		System.out.println(sb.length());
		sb.insert(16, "has ");
		System.out.println(sb);
	}
}
