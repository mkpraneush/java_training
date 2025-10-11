package stringconpct;

public class String_intro {
	public static void main(String[] args) {
		String str1="Manoj";
		String str2=new String("anoj");
		String str3="Manoj";
		String str4=new String("Manoj");
		char ch[]= {'M','a','n','o','j'};
		String str5=new String(ch);
		System.out.println(str1==str2);
		System.out.println(str1==str3);
		System.out.println(str2==str4);
		
		
	}
}
