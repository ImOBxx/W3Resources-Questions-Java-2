import java.util.Scanner;
public class Exercise56 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.print("Input the first number: ");
			int x = in.nextInt();
			System.out.print("Input the second number: ");
			int y = in.nextInt();
			System.out.print("Input the third number: ");
			int z = in.nextInt();
			System.out.print("the result is: " + sumoftwo(x, y, z));
		}
		System.out.print("\n");
	}
	public static boolean sumoftwo(int p, int q, int r) {
		return ((p + q)) == r || (q + r) == p || (r + p) == q;
	}

}
