class Solution {
  static public int[] twoSum(int[] nums, int target) {

		int temp = 0;

		int[] indexes = findIndexes(nums, target, temp);

		while (indexes[0] == indexes[1] || indexes[1] == 0) {
			indexes = findIndexes(nums, target, temp++);
		}

		return indexes;
	}

	static public int[] findIndexes(int[] nums, int target, int temp) {
		int[] vals = new int[2];
		
		vals[0] = temp;
		int newTarget = target - nums[temp];

		for (int i = temp + 1; i < nums.length; i++) {
			if (newTarget == nums[i]) {
				vals[1] = i;
			}
			
		temp++;

		}
		return vals;
	}
}
