import java.util.Scanner;
public class Exercise38 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.println("Input an integer: ");
			long n = input.nextLong();
			System.out.println("the sum of the digits is: " + sumDigits(n));
		}
        
	}
        public static int sumDigits(long n) {
        	int sum = 0;
        	while (n != 0) {
        		sum += n % 10;
        		n /= 10;
             }
        	return sum;
        }
       
}
