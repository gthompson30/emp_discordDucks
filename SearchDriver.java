import java.lang.System;

public class SearchDriver {

	public static void main(String[] args) {
		BinSearch binaryTest = new BinSearch();
		LinSearch linearTest = new LinSearch();

		Comparable[] nums = new Comparable[80000000];
		for (int i = 1; i <= 80000000; i++) {
			nums[i-1] = i;
		}

		float start = System.currentTimeMillis();
		int index = binaryTest.binSearch(nums, 40000003); // 34725);
		System.out.println(index + " ...should be 40000002");
		float end = System.currentTimeMillis();
		System.out.println("Binary Search Time:   " + (end - start));

		start = System.currentTimeMillis();
		System.out.println(start);
                index = linearTest.linSearch(nums, 40000003); // 34725);
                System.out.println(index + " ...should be 40000002");
		end = System.currentTimeMillis();
		System.out.println("Linear Search Time:   " + (end - start));
		//System.out.println(nums[399999]);
	}

}
