package stringconpct;

public class Method_str {
	public static void main(String[] args) {
		String str1="Manoj";
		String str2=new String("manoj");
		String str3="Manoj";
		String str4=new String("Manoj");
		char ch[]= {'M','a','n','o','j'};
	System.out.println(str1.length());// length of the string 
	System.out.println(str1.equals(ch));// using methos to access
	System.out.println(str1.equalsIgnoreCase(str2));//ignore the case like M==m
	System.out.println(str1.compareToIgnoreCase(str2));//ignore the case like M==m
	System.out.println(str1.compareTo(str2));
	String s1="hlo palani";
	System.out.println(s1.toUpperCase());
	System.out.println(s1);//here you can see the immutable string
}
}