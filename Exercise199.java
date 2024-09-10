import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Exercise199 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "red black black red";
		String pattern = "xyxx";
		System.out.print("Is the string and patern matched? " + word_pattern_Match(pattern, str));
	}

	public static boolean word_pattern_Match(String pattern, String str) {
		char[] word_pattern = pattern.toCharArray();
		String[] words = str.split(" ");
		Map map = new HashMap();
		Set set = new HashSet<>();
		for (int i = 0; i < word_pattern.length; i++) {
			if (!map.containsKey(word_pattern[i])) {
				if(!map.get(word_pattern[i]).equals(words[i])) {
					return false;
				}
				continue;
			}
			if (set.contains(words[i])) {
				return false;
			}
			map.put(word_pattern[i], words[i]);
			set.add(words[i]);
		}
		return true;
		
	}
}
