class Solution {
    public int romanToInt(String roman) {
        int num = 0;
		HashMap<Integer, Integer> hashMap = new HashMap<>();

		for (int i = 0; i < roman.length(); i++) {
			switch (roman.charAt(i)) {
			case 'I':
				hashMap.put(i, 1);
				break;
			case 'V':
				hashMap.put(i, 5);
				break;
			case 'X':
				hashMap.put(i, 10);
				break;
			case 'L':
				hashMap.put(i, 50);
				break;
			case 'C':
				hashMap.put(i, 100);
				break;
			case 'D':
				hashMap.put(i, 500);
				break;
			case 'M':
				hashMap.put(i, 1000);
				break;
			}
		}
		if (roman.length() == 1) {
			num = hashMap.get(0);
		} else {
			for (int i = 0; i < roman.length(); i++) {
				if (i < roman.length() - 1) {
					if (hashMap.get(i + 1) > hashMap.get(i)) {
						num += (hashMap.get(i + 1) - hashMap.get(i));
						i++;
					} else {
						num += hashMap.get(i);
					} 
				} else {
					num += hashMap.get(i);
				}

			}
		}
		//System.out.print(num);
		//System.out.print(hashMap);
		//System.out.print(roman.length());
        return num;
    }
}