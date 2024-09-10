import java.util.Scanner;
public class Exercise53 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.println("Input a number: ");
			int n = in.nextInt();
			if (n % 2 == 0) {
				System.out.println(1);
			} else {
			    System.out.println(0);
			}
		}

	}

}
