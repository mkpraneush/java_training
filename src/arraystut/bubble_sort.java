package arraystut;

import java.util.*;

public class bubble_sort {
	public static void main(String[] args) {
		int arr[]={94,34,45,57,8};
		System.out.println(Arrays.toString(arr));
		boolean flag=true;
		while(flag) {
			flag=false;
			for(int i =0;i<arr.length-1;i++) {
				if(arr[i]>arr[i+1]) {
					int temp =arr[i];
					arr[i]=arr[i+1];
					arr[i+1]=temp;
					flag=true;
				}
			}
			System.out.println(Arrays.toString(arr));
		}
		
	}

}
