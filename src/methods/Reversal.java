package methods;

public class Reversal {
		
		// Method to reverse a number
		int reverse(int num) {
			int rev = 0;
			while (num != 0) {
				int digit = num % 10;   // Get last digit
				rev = rev * 10 + digit; // Build reversed number
				num = num / 10;         // Remove last digit
			}
			return rev;
		}
		
		public static void main(String[] args) {
			Reversal r = new Reversal();
			
			System.out.println("Reverse of 1234 is: " + r.reverse(1234));
			System.out.println("Reverse of 9876 is: " + r.reverse(9876));
		}
	}


