import java.util.Scanner;
public class Exercise6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		try (Scanner Input = new Scanner(System.in)) {
			System.out.println("Input the first number");
			int a = Input.nextInt();
			System.out.println("Input the second number: ");
			int b = Input.nextInt();
			int d = (a / b);
			System.out.println();
			System.out.println("The division of a and b is: " + d);
		}
		
		
		

	}

}
