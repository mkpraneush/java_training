package collec_concepts;
import java.util.*;
public class Usingmeth_fOChar {
	static LinkedHashMap <Character ,Integer> freqchar (String st){
		LinkedHashMap<Character ,Integer> mp = new LinkedHashMap<>();
		for(char ch :st.toCharArray() ) {
			if(mp.containsKey(ch)) {
				mp.put(ch, mp.get(ch)+1);
			}
			else {
				mp.put(ch,1);
			}
		}return mp;
	}
		static char maxChar(String st) {
			LinkedHashMap<Character,Integer>op=freqchar(st);
			int max=0;
			char c='\0';
			for(Map.Entry<Character,Integer>it:op.entrySet()) {
				if(it.getValue()>max) {
					max=it.getValue();
					c=it.getKey();
				}
			}
			return c;
		}
	
	
	public static void main(String[] args) {
		String st="velalarvvv";
		char op = maxChar(st);
		System.err.println(op);
	}
}
