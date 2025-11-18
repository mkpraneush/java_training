package arr_2D;

public class transpose_mat {
	public static void main(String[]args) {
		int arr[][]= {{1,2,3},{5,6,7},{9,1,8}};
		int n=arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();
}
		System.out.println("Transpose");
			for(int j=0;j<arr.length;j++) {
				for(int i=0;i<arr.length;i++) {
				System.out.print(arr[i][j]+" ");
			}
			System.out.println();
		}
		}}

