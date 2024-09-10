import java.util.Scanner;
public class Exercise9 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.print("Input first number: ");
			int num1 = in.nextInt();
			System.out.println("Input second number: ");
			int num2 = in.nextInt();
			System.out.println(num1 + " x " + num2 + " = " + num1 * num2);
		}
		

	}

}
