class Solution:
    def removeDuplicates(self, nums: List[int]) -> int:
        temp = -101
        unique = 0
        idx = len(nums) - 1
        for x in reversed(nums):
            if x != temp:
                temp = x
                unique += 1
            else: 
                del nums[idx]
            idx -= 1
        return unique
        
            