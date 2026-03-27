class Solution {
    public int searchInsert(int[] nums, int x) {
        
        int l = 0;
		int h = nums.length - 1;
		int pH = -1;
		 
        if (x > nums[h]) {
			return h + 1;
		}

		while (l <= h) {
			int m = (h + l) / 2;

			if (nums[m] == x ) {
				return m;
			}
			
			if (x > nums[m]) {
				l = m + 1;
			}
			else {
				h = m - 1;
				pH = h;
			}
			
		}
		
		
		return pH + 1;

}
}