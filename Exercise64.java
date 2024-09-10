import java.util.Scanner;
public class Exercise64 {

	public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
			System.out.println("\nInput a word: ");
			String word = in.nextLine();
			word = word.trim();
			String result = "";
			char[] ch = word.toCharArray();
			for (int i = ch.length - 1; i >= 0; i--) {
				result += ch[i];
			}
			System.out.println("Reverse word: " + result.trim());
		}
        }
        
	}


