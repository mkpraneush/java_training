package home_work;
import java.util.*;
public class Ascan_arr {
		public static void main(String[] args) {
			int arr[]= {98,74,87,1,54,21,12,34,2};
			System.out.println(Arrays.toString(arr));
			boolean flag=true;
			while(flag)
			{
				flag=false;
				for(int i=0;i<arr.length-1;i++)
				{
					if(arr[i]>arr[i+1])
					{
						int temp=arr[i];
						arr[i]=arr[i+1];
						arr[i+1]=temp;
						flag=true;
					}
				}
				
			}
			System.out.println(Arrays.toString(arr));
			//sorting array in ascending order
			System.out.println("Sorted array in ascending order:");
			System.out.println(Arrays.toString(arr));
			
		}
	}


