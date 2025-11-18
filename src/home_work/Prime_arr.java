package home_work;
import java.util.Scanner;
import java.util.Arrays;
public class Prime_arr {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[10];
        System.out.println("Enter 10 numbers:");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.println("Array elements: " + Arrays.toString(arr));
        System.out.println("Prime numbers are:");
        for (int i = 0; i < arr.length; i++) {
            int n = arr[i];
            int count = 0;
            if (n <= 1)
                continue; // skip 0 and 1 (not prime)
            for (int j = 1; j <= n; j++) {
                if (n % j == 0)
                    count++;
            }
            if (count == 2) {
                System.out.print(n + " ");
            }
        }
        sc.close();
    }
}


