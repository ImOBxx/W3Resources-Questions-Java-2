import java.util.Scanner;
public class Exercise28 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] hex = new int[1000];
		int i = 1, j = 0, rem, dec = 0, bin;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Input a Binary Number: ");
			bin = in.nextInt();
		}
		while (bin > 0) {
			rem = bin % 2;
			dec = dec + rem * i;
			i = i * 2;
			bin = bin / 10;
		}
		i = 0;
		while (dec !=0) {
			hex[i] = dec % 16;
			dec = dec / 16;
			i++;
		}
		System.out.println("Hexadecimal Value: ");
		for (j = i - 1; j >= 0; j--) {
			if (hex[j] > 9) {
				System.out.println((char)(hex[j] + 55));
			} else {
				System.out.println(hex[j]);
				
			}
		}
                System.out.println("\n");
	}

}
