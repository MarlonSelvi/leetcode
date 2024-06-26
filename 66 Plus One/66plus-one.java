import java.math.BigInteger;

class Solution {
    public int[] plusOne(int[] digits) {
			

		
		int power = digits.length - 1;
		BigInteger ten = new BigInteger("10");
		BigInteger total = new BigInteger("0");
		
		for (int i = 0; i < digits.length; i++) {
			
			BigInteger digit = new BigInteger(String.valueOf(digits[i]));
			BigInteger expo = ten.pow(power);
			total = total.add((digit.multiply(expo)));
			power -= 1;
		}
		BigInteger one = new BigInteger("1");
		total = total.add(one);
		power = digits.length - 1;
		int arrLen = 0;
		BigInteger expo = ten.pow(power+1);
		if (((total.divide(expo)).compareTo(one) == 1) || ((total.divide(expo)).compareTo(one)) == 0) {
			arrLen = digits.length + 1;
			power +=1;
			}
		else {
			arrLen = digits.length;
		}
		int[] newDigits = new int[arrLen];
		
		BigInteger bigTotal = new BigInteger(String.valueOf(total));
		
		for (int i  = 0; i < digits.length; i++ ) {
			BigInteger bigExpo = ten.pow(power);
			
			BigInteger temp = bigTotal.divide(bigExpo);
			newDigits[i] =  temp.intValue();
			bigTotal = bigTotal.subtract(temp.multiply(bigExpo));
			power -= 1;
		}
		
		
		
		
		
		return newDigits;
				
    }
}