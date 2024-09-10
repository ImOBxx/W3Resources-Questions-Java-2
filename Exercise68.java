import java.util.Scanner;
public class Exercise68 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.println("Input the first number: ");
			int a = in.nextInt();
			System.out.println("Input the second number: ");
			int b = in.nextInt();
			int divided = a / b;
			int result = a - (divided * b);
			System.out.println(result);
		}

	}

}
