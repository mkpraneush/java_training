package home_work;
import java.util.*;
public class Even_arr {
	public static void main(String[] args) {
	/*	Scanner sc=new Scanner (System.in);
		int num[]=new int [10];
		for(int i=0;i<num.length;i++) {
			num[i]=sc.nextInt();
		}*/
		int num[]= {12,23,45,55,66,78,90};
		for(int i=0;i<num.length;i++) {
			if(i%2==0) {
				System.out.print(num[i]+" ");
			}
			
		}}}