import java.util.Scanner;
public class Exercise37 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner Input = new Scanner(System.in)) {
			int number1;
			int number2;
			System.out.println("Input first integer: ");
			number1 = Input.nextInt();
			System.out.println("Input second integer: ");
			number2 = Input.nextInt();
			if (number1 == number2)
			    System.out.printf("%d == %d\n", number1, number2);
			if (number1 != number2)
				System.out.printf("%d != %d\n", number1, number2);
			if (number1 < number2)
				System.out.printf("%d < %d\n", number1, number2);
			if (number1 > number2)
				System.out.printf("%d > %d\n", number1, number2);
			if (number1 <= number2)
				System.out.printf("%d <= %d\n", number1, number2);
			if (number1 >= number2)
				System.out.printf("%d >= %d/n", number1, number2);
		}
		
			
			
		

	}

}
