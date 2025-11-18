package collec_concepts;
import java.util.*;
public class FrequencyOfChar {
	public static void main(String[] args) {
		String ch = "velalar";
		LinkedHashMap <Character,Integer > fc = new LinkedHashMap<>();
		for(char op : ch.toCharArray() ) {
			if(fc.containsKey(op)) {
				fc.put(op, fc.get(op)+1);
			}
			else {
				fc.put(op,1);
			}
		}
		System.out.println(fc);
		
	}
}
