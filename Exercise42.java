import java.util.Scanner;
public class Exercise42 {

	private static final int i = 0;

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner scanner = new Scanner(System.in)) {
			System.out.println("Input a string: ");
			char[] letters = scanner.nextLine().toCharArray();
			System.out.print("Reverse string: ");
			for (int i = letters.length - 1; i >= 0; i--);
			System.out.print(letters[i]);
		}
	}
	   
	    
	    
	}


