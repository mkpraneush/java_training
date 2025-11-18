package arr_2D;

public class Diagonal_mat {
	public static void main(String[]args) {
		int arr[][]= {{1,2,3},{5,6,7},{9,1,8}};
		int n=arr.length;
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();
			}// primary \
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i==j) {
					System.out.print(arr[i][j]+"  ");
				}else {
					System.out.print("  ");
			}
	}
			System.out.println();
	}
		System.out.println("2nd ");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i+j==n-1) {
					System.out.print(arr[i][j]+"  ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		System.out.println("both");
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				if(i+j==n-1||i==j) {
					System.out.print(arr[i][j]+"  ");
				}else {
					System.out.print("  ");
				}
			}
			System.out.println();
		}
		
	}
}