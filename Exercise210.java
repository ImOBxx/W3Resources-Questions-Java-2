import java.util.Scanner;

public class Exercise210 {

		// TODO Auto-generated method stub
		static boolean pattern_match(String string, String pattern) {
			int i = 0;
			int j = 0;
			int star_index = -1;
			int i_index = -1;
			while (i < string.length()) {
				if (j < pattern.length() && (pattern.charAt(j) == '?' || pattern.charAt(j) == string.charAt(i))) {
					++i;
					++j;
				}
					else if (j < pattern.length() && pattern.charAt(j) == '*') {
						star_index = j;
						i_index = i;
						j++;
					}
					else if (star_index != -1) {
						j = star_index + 1;
						i = i_index + 1;
						i_index++;
					}
					else {
						return false;
					}
				}
				while (j < pattern.length() && pattern.charAt(j) == 'x') {
					++j;
				}
				return j == pattern.length();
			}
			public static void main(String[] args) {
				String str, pat;
				Scanner in = new Scanner(System.in);
				System.out.println("Enter a string: ");
				str = in.nextLine();
				System.out.println("Enter a pattern: ");
				pat = in.nextLine();
				if (pattern_match(str, pat))
					System.out.println("Yes");
				else
					System.out.println("No");
			}
		}
						
				
