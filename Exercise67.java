import java.util.Scanner;
public class Exercise67 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			System.out.println("Input the first number: ");
			int a = in.nextInt();
			System.out.println("Input the second number: ");
			int b = in.nextInt();
			System.out.println("Result: " + common_digit(a, b));
		}
	}
	    public static boolean common_digit(int p, int q) {
	    	if (p < 25 || q > 75) {
	    		return false;
	    	}
	    	
	    	int x = p % 10;
	    	int y = q % 10;
	    	
	    	p /= 10;
	    	q /= 10;
	    	
	    	return (p == q || p == y || x == q || x == y);
	    	}
	    

	}


