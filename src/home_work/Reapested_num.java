package home_work;
import java.util.*;
public class Reapested_num {
	
		public static void main(String[] args) {
			Scanner sc=new Scanner(System.in);
			int arr[]=new int[7];
			for(int i=0;i<arr.length;i++) {
				System.out.println("Enter the values:");
				arr[i]=sc.nextInt();
			}
			System.out.println(Arrays.toString(arr));
			int repeat_val=arr[0];
			int max=0;
			for(int i=0;i<arr.length;i++) {
				int count=0;
				for(int j=0;j<arr.length;j++) {
					if(arr[i]==arr[j]) {
						count++;
					}
				}
				if(count>max) {
					max=count;
					repeat_val=arr[i];
				}
			}
			System.out.println("Most repeated value is :"+repeat_val);
			System.out.println("The count is "+max+" times");
		}
	}


