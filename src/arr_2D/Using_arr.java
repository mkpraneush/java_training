package arr_2D;

public class Using_arr {
	public static void main(String[]args) {
		int [][]a= {{1,2,3},{4,5,6},{7,8,9}};
		int [][]a1= {{4,5,6},{7,8,9},{1,2,3}};
		int sum[][]=new int[3][3];
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a1[0].length;j++) {
				sum[i][j]=a[i][j]+a1[i][j];
			}
		}
		for (int i=0;i<a.length;i++) {
			for (int j=0;j<a1[0].length;j++) {
				System.out.print(sum[i][j]+" ");
			}		
			System.out.println();
			}
		}

}
