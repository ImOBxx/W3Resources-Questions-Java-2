import java.util.HashMap;

public class Exercise187 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "google";
		System.out.println("Index of first non-repeating chararcter in " + str1 + " is: " + first_unique_character(str1));
	}
	public static int first_unique_character(String str1) {
		HashMap<Character, Integer> map = new HashMap<>();
		for (int i = 0; i < str1.length(); ++i) {
			char chr = str1.charAt(i);
			map.put(chr, map.containsKey(chr) ? map.get(chr) + 1 : 1);
		}
		for (int i = 0; i < str1.length(); ++i) {
			if (map.get(str1.charAt(i)) < 2) {
				return i;
			}
		}
		return -1;
			}
		}

	
