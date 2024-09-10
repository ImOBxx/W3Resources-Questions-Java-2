import java.util.Scanner;

public class Exercise208 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		StringCompression str = new StringCompression();
		String s1, s2;
		try (Scanner in = new Scanner(System.in)) {
			System.out.println("Enter a string (you can include space as well");
			s1 =in.nextLine();
		}
		s2 = s1.replaceAll("\\s", "");
		str.Compression(s2);
	}
	public static String Compression(String s) {
		int count = 1;
		StringBuilder sb = new StringBuilder();
		for (int i =1; i < s.length() - 1; i++) {
			if (s.charAt(i) == s.charAt(i - 1)) {
				count++;
			} else {
				sb.append(s.charAt(i - 1));
				sb.append(count);
				count = 1;
			}
		}
		if (s.length() > 1) {
			if (s.charAt(s.length() - 1) == s.charAt(s.length() - 2)) {
				count++;
			} else {
				sb.append(s.charAt(s.length() - 2));
				sb.append(count);
			}
			s = sb.toString();
			System.out.println("The compressed string along with the counts of repeated characters is:" + "\n" + s);
			return s;
			
			}
		return s;
		}

	}


