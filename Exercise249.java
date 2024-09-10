import java.util.Scanner;

public class Exercise249 {

	
		// TODO Auto-generated method stub
		static int count_Set_Bits(int num) {
			int ctr = 0;
			while (num != 0) {
				while (num != 0) {
					num = num & (num - 1);
					ctr++;
				}
				return ctr;
			}
			
				public static void main(String[] args) {
					Scanner sc = new Scanner(System.in);
				
					System.out.print("Input a number: ");
					int num = sc.nextInt();
					System.out.println(count_Set_Bits(num));
					sc.close();
				}
			}
	
