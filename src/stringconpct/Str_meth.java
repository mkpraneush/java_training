package stringconpct;

public class Str_meth {
	public static void main(String[] args) {
		String s2="nAA tHAN dAW ";
		System.out.println(s2.trim());
		System.out.println(s2.indexOf("han"));
		System.out.println(s2.indexOf('W'));//in the  indexOf area ' can accpect here
		System.out.println(s2.indexOf("d",9)+" - ");
		//using to find the
		System.out.println(s2.lastIndexOf("W"));
		System.out.println(s2.contains("tHAN"));
		System.out.println(s2.substring(9,12));
		System.out.println(s2.endsWith(" ")+"--");
		System.out.println(s2.repeat(2));
		System.out.println(s2.replaceFirst("nAA","nee"));
		System.out.println(s2.replace(" ","_"));
		System.out.println(s2.replaceAll("[A]","_"));
		System.out.println(s2.replaceAll("[A]","_"));
		
		
	}

}
