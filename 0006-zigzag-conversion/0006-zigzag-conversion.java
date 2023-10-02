public class Solution {
    public String convert(String s, int nRows) {
        if (nRows <= 0)
			return "";
		
		if (nRows == 1){
			return s;
		}
		
		s = s.trim();
		
		if (s == "") 
			return "";
		
		String[] items = new String[nRows];
		for (int i=0; i<items.length; i++){
			items[i] = "";
		}
		
		int mode = 2 * nRows - 2;
		int a;
		for (int i=0; i<s.length(); i++){
			a = i % mode;
			if (a < nRows){
				items[a] += s.substring(i, i+1); 
			} else {
				items[mode-a] += s.substring(i, i+1);
			}
		}
		
		String ret = "";
		for (int i=0; i<items.length; i++){
			ret += items[i];
		}
		
		return ret;
    }
}