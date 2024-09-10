import java.util.Scanner;
public class Exercise48 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n;
		char s1, s2, s3;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Input number: ");
			n= in.nextInt();
		}
		System.out.printf("%d + %d%d + %d%d%d\n", n, n, n, n, n, n);

	}

}
