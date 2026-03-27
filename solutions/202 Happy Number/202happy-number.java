class Solution {
    public boolean isHappy(int n) {
        int happyNumVal = 0;
		int loop = 0;
		while(loop < 7) {
			
			String num = String.valueOf(n);
			char[] charNum = new char[num.length()];
			
			for (int i = 0; i < num.length(); i++) {
				charNum[i] = num.charAt(i);
			}
			happyNumVal = 0;
			
			for (int i = 0; i < num.length(); i++) {
				int temp = charNum[i] - '0';
				happyNumVal += (temp * temp);
			}
			if (happyNumVal == 1) {
				return true;
			}
			
			n = happyNumVal;
			loop++;
		}
		
		return false;
	
    }
}