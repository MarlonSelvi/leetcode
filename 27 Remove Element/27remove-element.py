# 1. Remove instances of val from nums array
# 2. (Number of num in nums that are not equal to val) = k

class Solution:
    def removeElement(self, nums: List[int], val: int) -> int:
        count = 0
        index_to_remove = []
        for num in nums:
            print(num)
            if num == val:
                index_to_remove.append(count)
            count += 1
            
        for i in reversed(index_to_remove):
            nums.pop(i)
        return len(nums)
        