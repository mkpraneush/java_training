package contrl_stmt;
import java.util.Scanner;

public class Strong {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n, temp, rem, sum = 0;

        System.out.print("Enter a number: ");
        n = sc.nextInt();

        temp = n;

        while (n != 0) {
            rem = n % 10;
            int fact = 1;
            for (int i = 1; i <= rem; i++) {
                fact *= i;
            }
            sum += fact;
            n /= 10;
        }

        if (sum == temp)
            System.out.println(temp + " is a Strong number.");
        else
            System.out.println(temp + " is not a Strong number.");

      
    }
}