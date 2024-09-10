import java.util.Scanner;

public class Exercise193 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.print("Input a positive integer: ");
		int n = in.nextInt();
		int result = (n * (n + 1) / 2) * (1 << (n - 1));
		System.out.println("Sum of subsets of n is : " + result);
		

	}

}
