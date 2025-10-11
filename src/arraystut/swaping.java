package arraystut;

import java.util.Arrays;

public class swaping {
	public static void main(String[] args) {
		int arr[]={24,34,45,57,89};
		System.out.println(Arrays.toString(arr));
		int temp=arr[2];
		arr[0]=arr[2];
		arr[2]=temp;
		for(int i=0;i<arr.length;i++) {
			System.out.println(arr[i]);
		}
		System.out.println();
		for(int n:arr) {
			System.out.println(n);
		}
		System.out.println(Arrays.toString(arr));
}
}
