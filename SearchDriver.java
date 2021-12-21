import java.lang.System;

public class SearchDriver {

	public static long testBin(Comparable[] a, int target) {
		long start, end, diff;
		BinSearch b = new BinSearch();

		start = System.currentTimeMillis();
		b.binSearch(a, target);
		end = System.currentTimeMillis();
		diff = end - start;
		return diff;

	}

	public static long testLin(Comparable[] a, int target) {
                long start, end, diff;
                LinSearch l = new LinSearch();

                start = System.currentTimeMillis();
                l.linSearch(a, target);
                end = System.currentTimeMillis();
                diff = end - start;
                return diff;

	}

	public static void fullTest(Comparable[] nums, int numTests) {
		int targetIndex, target;
		System.out.println("----------------------------------------------------------------");

		for (int i = 0; i < numTests; i++) {
                        targetIndex = (int) (Math.random() * (nums.length - 1));
                        target = (int) nums[targetIndex];
                        System.out.println("Target Index: " + targetIndex);
                        System.out.println("BinSearch time: " + testBin(nums, target) + "ms");
                        System.out.println("LinSearch time: " + testLin(nums, target) + "ms\n");
                }
	}

	public static Comparable[] createAscendingArray(int n) {
		Comparable[] a = new Comparable[n];
		for (int i = 1; i < n; i++) {
			a[i - 1] = i;
		}
		return a;
	}

	public static void main(String[] args) {
		Comparable[] nums;

		nums = createAscendingArray(100);
		fullTest(nums, 100);

                nums = createAscendingArray(500);
                fullTest(nums, 100);

                nums = createAscendingArray(10_000);
                fullTest(nums, 100);

                nums = createAscendingArray(1_000_000);
                fullTest(nums, 100);

                nums = createAscendingArray(10_000_000);
                fullTest(nums, 100);

                nums = createAscendingArray(50_000_000);
                fullTest(nums, 100);

                //nums = createAscendingArray(50_000_000);
                //fullTest(nums, 100);

	}

}

