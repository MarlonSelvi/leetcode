import java.util.ArrayList;
import java.util.List;
class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> pascal =  new ArrayList();
		
		pascal.add(new ArrayList<Integer>());
		
		if (numRows >=1) {
			pascal.get(0).add(1);

		}
		
		
		for (int i = 1; i < numRows; i++) {
			pascal.add(new ArrayList<Integer>());
			pascal.get(i).add(1);
			if (i >= 2) {
				for (int j = 1; j < pascal.get(i - 1).size(); j++) {
					pascal.get(i).add(pascal.get(i - 1).get(j) + pascal.get(i-1).get(j-1));
				}
				
			}
			pascal.get(i).add(1);
		}
		
		return pascal;
    }
}