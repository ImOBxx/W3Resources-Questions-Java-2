import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class Exercise202 {
		// TODO Auto-generated method stub
		public static void main(String[] args) {
			int[] nums = {4, 2, 3, 3, 7, 2, 4};
			int k = 6;
			System.out.println("Original Array: " + Arrays.toString(nums));
			System.out.print("\nValue of k: "+ k);
			System.out.println("\nTotal number of continuos subarrays: " + max_SubArray(nums, k));
		}
		public static int max_SubArray(int[] nums, int k) {
			int ctr = 0;
			int sum = 0;
			Map<Integer, Integer> map = new HashMap<>();
			map.put(0, 1);
			for (int i = 0; i < nums.length; i++) {
				if (map.containsKey(sum - k)) {
					ctr += map.get(sum - k);
				}
				map.put(sum, map.getOrDefault(sum, 0) + 1);
			}
			return ctr;
				}
			}

