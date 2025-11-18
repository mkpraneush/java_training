package stringconpct;

public class String_Rev {
	public static void main(String[] args) {
		String s2="nAA tHAN dAW ";
		String res="";
		for(int i=s2.length()-1;i>=0;i--) {
			char ch=s2.charAt(i);
			res=res+ch;
		}
		System.out.println(res);
	}
}
