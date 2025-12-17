class Solution {
    public int romanToInt(String s) {
        HashMap<Character,Integer> dict = new HashMap<>();
		dict.put('I', 1);
        dict.put('V', 5);
        dict.put('X', 10);
        dict.put('L', 50);
        dict.put('C', 100);
        dict.put('D', 500);
        dict.put('M', 1000);
		int num =0,preval = 0;
		for(char ch:s.toCharArray()){
			int val = dict.get(ch);
			if(val>preval){
				num = num+val-2*preval;
			}
			else num+=val;
			preval = val;
		}
		return num;
    }
}