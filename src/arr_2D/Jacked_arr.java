package arr_2D;

public class Jacked_arr {
	public static void main(String[]args) {
		int arr[][]= {{1,2,3},{4,5,6},{7,8,9}};
		int brr[][]=new int [4][];
		brr[0]=new int [3];
		brr[1]=new int [2];
		brr[2]=new int [1];
		brr[3]=new int [5];
		for (int i=0;i<arr.length;i++) {
			for(int j=0;j<brr[i].length;j++) {
				System.out.print(brr[i][j]);
			}
			System.out.println();
		}
		}

}
