import java.util.HashMap;

class Solution {
    public int maxProfit(int[] prices) {
        
        int high = prices[0];
		int low = prices[0];
		HashMap <Integer, Integer>maxProfits = new HashMap<>();
		maxProfits.put(0, 0);

		for (int i = 1; i < prices.length; i++) {
			if (prices[i] > high) {
				high = prices[i];
				maxProfits.put(i, high - low);
			} else if (prices[i] < low) {
				low = prices[i];
				high = low;
				maxProfits.put(i, high - low);

			}
			else {
				maxProfits.put(i, -1);

			}
		}
		
		int highestProfit = 0;
		for (int i = 0; i < maxProfits.size(); i++) {
			if (maxProfits.get(i) > highestProfit) {
				highestProfit = maxProfits.get(i);
			}
		}
		
		if (highestProfit <= 0) {
			return 0;
		}
		
		return highestProfit;

    }
}