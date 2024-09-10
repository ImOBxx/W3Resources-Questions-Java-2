import java.util.Arrays;

public class Exercise201 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = { 1, 3, 3, 5, 6, 6};
		int target = 4;
		System.out.println("Original Array: " + Arrays.toString(nums));
		System.out.println("\nTarget of subsets: " + target);
		System.out.println("\nAfter removing duplicate characters: " + partition_k_subsets(nums, target));
	}
	static boolean search_subset(int use, int n, boolean[] flag, int[] nums, int target) {
		if (n == 0) {
			return true;
		}
		int used;
		if (!flag[used]) {
			flag[used] = true;
			int remain_num = (n -1) % target + 1;
			for(int i = 0; i < nums.length; i++) {
				if ((((used >> i) & 1) == 0) && nums[i] <= remain_num) {
					if (search_subset(used | (1 << i), n - nums[i], flag, nums, target)) {
						return true;
					}
				}
			}
		}
		return false;
	}

	public static boolean partition_k_subsets(int[] nums, int k) {
		int sum = Arrays.stream(nums).sum();
		if (sum % k > 0) {
			return false;
			boolean[] flag = new boolean[1 << nums.length];
			return search_subset(0, sum, flag, nums, sum / k);
					}
				