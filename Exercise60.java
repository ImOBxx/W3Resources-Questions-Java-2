import java.util.Scanner;
public class Exercise60 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner in = new Scanner(System.in)) {
			int x = in.nextInt();
			System.out.println(result(x));
		}
	}
        public static int result(int num) {
        	int ctr = 0;
        	for (int i = 1; i <= (int) Math.sqrt(num); i++); {
        		int i = 0;
				if (num % i == 0 && i * i != num) {
        			ctr +=2; 
        		} else {
        			ctr ++;
        		}
        	}
        	return ctr;
        			
        		}
        	
	}


