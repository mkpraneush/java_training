package stringconpct;

public class UpperToLower {
	public static void main(String[] args) {
		String s2="nAA tHAN dAW ";
		String res="";
		for(int i=0;i<s2.length();i++)
		{
			char ch=s2.charAt(i);
			if(ch>=97 && ch<='z')
			{
				ch=(char)(ch-32);
			}
			else if(ch>='A' && ch<='Z')
			{
				ch=(char)(ch+32);
			}
			res=res+ch;
		}
		System.out.println(res);
	}
}