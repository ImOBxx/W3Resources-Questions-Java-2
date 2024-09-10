import java.util.Scanner;

public class Exercise31 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String octal_num, hex_num;
		int decnum;
		Scanner in =  new Scanner(System.in);
		System.out.println("Input an octal number: ");
		octal_num = in.nextLine();
		decnum = Integer.parseInt(octal_num, 8);
		hex_num = Integer.toHexString(decnum);
		System.out.println("Equivalent hexadecimal number: " + hex_num + "\n");

	}

}
