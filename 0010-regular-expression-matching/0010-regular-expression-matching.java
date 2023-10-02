class Solution {
    public boolean isMatch(String s, String p) {
        int sLen = s.length();
        int pLen = p.length();
        return myMatch(s, sLen - 1, p, pLen - 1);
    }
    public static boolean myMatch(String s, int i, String p, int j){
        if(j == -1)
            if(i == -1) return true;
        else return false;
        if(p.charAt(j) == '*'){
            if( i > -1 && (p.charAt(j - 1) == s.charAt(i) || p.charAt(j - 1) == '.')){
                if(myMatch(s, i - 1, p, j))
                    return true;
            }
            return myMatch(s, i, p, j - 2);
        }
        if(i > -1 && j > -1 && (p.charAt(j) == '.' || p.charAt(j) == s.charAt(i)))
            return myMatch(s, i - 1, p, j - 1);
        return false;
    }
}