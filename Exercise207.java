import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Exercise207 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList list1 = new LinkedList<>();
		try (Scanner input = new Scanner(System.in)) {
			System.out.print("How many elements do you want to add in the in the 1st linked list?: ");
				int num = input.nextInt();
				System.out.print("Input numbers of the 1st linked list in the ascending order: ");
				for (int i = 0; i < num; i++) {
				int element = input.nextInt();
				list1.add(element);
				}
				System.out.println();
				List<Integer> list1_1 = new ArrayList<Integer>(list1);
				Object[] list1_1_1 = list1_1.toArray();
				int[] list1_1_1_1 = new int[list1_1_1.length];
				for (int i = 0; i < list1_1_1.length; i++)
					list1_1_1_1[i] = (int) list1_1_1[i];
				LinkedList<Integer> list2 = new LinkedList<>();
				System.out.print("How many elements do you want to add in the 2nd linked list?: ");
				int num1 = input.nextInt();
				System.out.print("Input numbers of the 2nd linked list in ascending order: ");
				for (int i = 0; i < num1; i++) {
					int element = input.nextInt();
					list2.add(element);
				}
				System.out.println();;
				List<Integer> list2_2 = new ArrayList<Integer>(list2);
				Object[] list2_2_2 = list2_2.toArray();
				int[] list2_2_2_2 = new int[list2_2_2.length];
				for (int i = 0; i < list2_2_2.length; i++)
					list2_2_2_2[i] = (int) list2_2_2[i];
				int[] mergedArray = merge(list1_1_1_1, list2_2_2_2);
				System.out.print("Merged list: ");
				for (int i = 0; i < mergedArray.length; i++) {
					System.out.print(mergedArray[i] + " ");
				}
		}
	}
	public static int[] merge(int[] list1_1_1_1, int[] list2_2_2_2) {
		int[] listMerged = new int[list1_1_1_1.length + list2_2_2_2.length];
		int i = 0, j = 0, k =0;
		while (i < list1_1_1_1.length && j < list2_2_2_2.length) {
			if (list1_1_1_1[i] < list2_2_2_2[j]) {
			listMerged[k] = list1_1_1_1[i];
			i++;
		} else {
			listMerged[k] = list2_2_2_2[j];
			j++;
		}
		k++;
	}
	while (i < list1_1_1_1.length) {
		listMerged[k] = list1_1_1_1[i];
		i++;
		k++;
	}
	while (j < list2_2_2_2.length) {
		listMerged[k] = list2_2_2_2[j];
		j++;
		k++;
	}
	return listMerged;
}

}


