public class SearchDriver {

	public static void main(String[] args) {
		BinSearch binaryTest = new BinSearch();
		LinSearch linearTest = new LinSearch();

		Comparable[] nums = new Comparable[100000];
		for (int i = 0; i < nums.length; i++) {
			nums[i] = 5 * i;
		}
		int index = linearTest.linSearch(nums, 34725);
		System.out.println(index + " ...should be 6946");
	}

}
