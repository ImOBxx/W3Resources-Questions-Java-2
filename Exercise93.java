import java.util.Arrays;

public class Exercise93 {

	private static int i;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = {5, 7, 2, 4, 9};
		int ctr_even = 0, ctr_odd = 0;
		System.out.println("Original Array: " + Arrays.toString(nums));
		for(int i = 0; i < nums.length; i++);
		if (nums[i] % 2 == 0) {
			ctr_even++;
		} else {
			ctr_odd++;
		
	    System.out.printf("\nNumber of even elements in the array: %d", ctr_even);
	    System.out.printf("\nNumber of odd elements in the array: %d", ctr_even);
	    System.out.printf("\n");
			
			
		}
	}
}

	


