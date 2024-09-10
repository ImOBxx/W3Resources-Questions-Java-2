import java.util.Scanner;
public class Exercise29 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			long octal_num, decimal_num = 0;
			int i = 0;
			System.out.println("Input any octal number: ");
			octal_num = in.nextLong();
			while (octal_num != 0) {
				decimal_num = (long)(decimal_num + (octal_num % 10) * Math.pow(8, i++));
				octal_num = octal_num / 10;
			}
		}
		
		System.out.println("Equivalent decimal number: " + decimal_num + "\n");
		}
		

	}

