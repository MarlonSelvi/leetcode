class Solution {
    public int majorityElement(int[] nums) {
        HashMap<Integer, Integer> numbers = new HashMap<>();
		
		for (int i = 0; i < nums.length; i++) {
			if (numbers.containsKey(nums[i]) == true) {
				numbers.put(nums[i], (numbers.get(nums[i]) + 1));
			}
			else {
				numbers.put(nums[i], 1);
			}
		}
		
		int majority = nums.length / 2;
		for (int i = 0; i < nums.length; i++) {
			if (numbers.get(nums[i]) > majority) {
				return nums[i];
			}
		}
		return -1;
    }
}