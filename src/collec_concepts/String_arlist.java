package collec_concepts;
import java.util.*;
public class String_arlist {
public static void main(String[] args) {
	Scanner scan = new Scanner (System.in);
	
	ArrayList <String> st =new ArrayList<>();
	for(int i=0; i<3;i++) {
		String str=scan.nextLine();
		st.add(str);
	}
	System.out.println(st);
	st.set(2, "oyee");
	System.out.println(st);
	for(String num: st) {// each loop 
	System.out.print(num+" ");}
	Collections.sort(st);
	System.out.println(st);
	System.out.println(st.contains("me"));//check the element inside the arr
	System.out.println(st.isEmpty());//if it empty or not
	st.clear();// to clear all element
	System.out.println(st);// inside the sop can't run "clear"
}
}
