class Solution {
    public boolean isPalindrome(int x) {
        
        if (x < 0){
            return false;
        }
        String number = Integer.toString(x);
		String backward = "";
		for(int i = number.length() - 1; i >= 0; i--) {
			backward += number.charAt(i);
		}
		


		if (backward.equalsIgnoreCase(number)) {
			return true;
		} 
        return false;


    }
}