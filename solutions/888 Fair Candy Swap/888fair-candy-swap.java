import java.util.HashMap;

class Solution {
    public int[] fairCandySwap(int[] alice, int[] bob) {
        int[] answer = new int[2];
		HashMap<Integer, Integer> hashAlice = new HashMap<>();
		HashMap<Integer, Integer> hashBob = new HashMap<>();

		int aliceSum = 0;
		for (int i = 0; i < alice.length; i++) {
			aliceSum += alice[i];
			hashAlice.put(i, alice[i]);
		}
		int bobSum = 0;
		for (int i = 0; i < bob.length; i++) {
			bobSum += bob[i];
			hashBob.put(i, bob[i]);
		}
		
		for (int i = 0; i < alice.length; i++) {
			for (int j = 0; j < bob.length; j++) {
				if ((bobSum - bob[j]) + alice[i] == (aliceSum - alice[i]) + bob[j]) {
					answer[0] = alice[i];
					answer[1] = bob[j];
				}
			}
		}
			
		
		
		return answer;
    }
}