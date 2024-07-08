import java.util.ArrayList;
import java.util.HashMap;

class Solution {
    public List<Integer> findDisappearedNumbers(int[] nums) {
        List<Integer> missing = new ArrayList<>();
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
           if (hash.containsKey(nums[i]) == false){
                hash.put(nums[i], i);
           }
        }
        for (int i = 1; i <= nums.length; i++) {
            if (hash.containsKey(i) == false) {
                missing.add(i);
            }
        }
        
        return missing;	
    }
}