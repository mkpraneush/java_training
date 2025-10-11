package contrl_stmt;
import java.util.Scanner;

public class MinMax {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();

        int digit = n % 10;  // take the last digit
        int min = digit;
        int max = digit;

        n = n / 10;  // remove the last digit

        while (n > 0) {
            digit = n % 10;
            if (digit < min) min = digit;//min
            if (digit > max) max = digit;//max
            n = n / 10;
        }

        System.out.println("Min digit: " + min);
        System.out.println("Max digit: " + max);
    }
}
