package arraystut;

public class Arr_Max {
	public static void main(String[] args) {
		int arr[]= {44,66,87,909,92,94};
		int max= (arr[arr.length-1]);
		for(int i=0;i<arr.length;i++) {
			if(max>arr[i]) {
				max = arr[i];
			}
		}
		System.out.println("max: "+max);

	}
}
