import java.util.Scanner;

public class Exercise195 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in);
		System.out.println("Input side1: ");
		int s1 = in.nextInt();
		System.out.println("Input side2: ");
		int s2 = in.nextInt();
		System.out.println("Input side3: ");
		int s3 = in.nextInt();
		System.out.println("Is the said sides form a triangle: " + isValidTriangle(s1, s2, s3));
	}
	public static boolean isValidTriangle(int a, int  b, int c) {
		return (a + b > c && b + c > a && c + a > b);
	}
}

	
