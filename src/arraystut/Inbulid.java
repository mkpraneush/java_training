package arraystut;

import java.util.Arrays;

public class Inbulid {
	public static void main(String[] args) {
		//int arr[]= {23,9,2,6,0,654};
		int arr[]=new int[5];
		System.out.println(Arrays.toString(arr));
		System.out.println(arr);
		//Arrays.sort(arr);---> it using the quick=(nlogn)
		//System.out.println(Arrays.toString(arr));
		/*Arrays.fill(arr, 5);// fill the element with empty arr
		System.out.println(Arrays.toString(arr));
		int area[]=Arrays.copyOf(arr, 2);
		System.out.println(Arrays.toString(area));
		System.out.println(dest);*/
		int dest[]=new int [5];
		System.arraycopy(arr,2,dest,5,arr.length-2);

	}
}
