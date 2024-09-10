import java.util.Scanner;
public class Exercise35 {

	public static void main(String[] args) {
		try (// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in)) {
			System.out.print("Input the length of a side of the hexagon: ");
			double s = input.nextDouble();
			System.out.println("The area of the hexagon is: " + hexagonArea(s) + "\n");
		}
	}	
    public static double hexagonArea(double s) {
    	return (6 * (s * s)) / (4 * Math.tan(Math.PI / 6));
	}

}
