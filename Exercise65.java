import java.util.Scanner;
public class Exercise65 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.println("Input the first number : ");
			int x = in.nextInt();
			System.out.println("Input the second number: ");
			int y = in.nextInt();
			System.out.println("Input the third number: ");
			int z = in.nextInt();
			System.out.println(Math.abs(x - y) >= 20 || Math.abs(y - z) >= 20 || Math.abs(z - x) >= 20);
		}
		
		
		

	}

}
