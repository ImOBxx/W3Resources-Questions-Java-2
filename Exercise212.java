import java.util.Scanner;

public class Exercise212 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Input two integers(a, b):");
		Scanner stdIn = new Scanner(System.in);
		int a = stdIn.nextInt();
		int b = stdIn.nextInt();
		int sum = a + b;
		int count = 0;
		while (sum != 0) {
			sum /= 10;
			++count;
		}
		System.out.println("Diggit nuber of sum of said two integers: ");
		System.out.println(count);
		}

	}

