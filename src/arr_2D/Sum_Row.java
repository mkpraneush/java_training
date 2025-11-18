package arr_2D;

public class Sum_Row {
	public static void main(String[] args) {
		
		int arr[][]= {{1,2,3},{5,6,7},{9,1,8}};
		for(int i=0;i<arr.length;i++) {
			for(int j=0;j<arr[i].length;j++) {
				System.out.print(arr[i][j]+" ");
				}
			System.out.println();
		}
		// row count only in square matrix
		for(int i=0;i<arr.length;i++) {
			int sum=0;
			for(int j=0;j<arr[0].length;j++) {
			sum+=arr[i][j];
			
		}
			System.out.println("Row "+sum);
	}//column
		for(int j=0;j<arr[0].length;j++) {
			int sum=0;
			for(int i=0;i<arr.length;i++) {
			sum+=arr[i][j];
			
		}
			System.out.println("Column "+sum);
		}
}}