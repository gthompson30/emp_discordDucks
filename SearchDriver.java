public class SearchDriver {

	public static void main(String[] args) {
		BinSearch binaryTest = new BinSearch();
		LinSearch linearTest = new LinSearch();

		Comparable[] nums = new Comparable[100000];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 5 * i;
		}
		nums = new Comparable[80000000];
		for (int i = 1; i <= 80000000; i++) {
			nums[i-1] = i;
		}
		int index = binaryTest.binSearch(nums, 5); // 34725);
		System.out.println(index + " ...should be 4");
                index = linearTest.linSearch(nums, 400000); // 34725);
                System.out.println(index + " ...should be 40000000");
		System.out.println(nums[400000]);
	}

}
