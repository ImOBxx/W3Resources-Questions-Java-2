import java.util.Scanner;

public class Exercise205 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		boolean b = true;
		Scanner in = new Scanner(System.in);
		System.out.print("Input a number: ");
		int num = in.nextInt();
		{
			while (num != 1) {
			if (num % 2 != 0) {
						b = !b;
						System.out.print(b);
						System.exit(0);
					}
					num = num / 2;
				}
				System.out.print(b);
					}
				}
			}

