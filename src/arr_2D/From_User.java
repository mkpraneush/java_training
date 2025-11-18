package arr_2D;
import java.util.Arrays;
import java.util.Scanner;

public class From_User {
		public static void main(String[] args) {
			Scanner sc=new Scanner (System.in);
			int arr[][]=new int [3][3];
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					arr[i][j]=sc.nextInt();
				}
				}
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					System.out.print(arr[i][j]+" ");
				}
				System.out.println();
			}
			for(int i=0;i<arr.length;i++) {
				for(int j=0;j<arr.length;j++) {
					if(arr[i][j]%2==0) {
						System.out.print(arr[i][j]);
					}else {
						System.out.print("*");
					}
				}
				System.out.println();
				}
		}
	}

