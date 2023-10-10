class Solution {
    public String addBinary(String a, String b) {
        StringBuilder res = new StringBuilder("");
        a = new String((new StringBuilder(a)).reverse());
        b = new String((new StringBuilder(b)).reverse());
        int n1 = a.length();
        int n2 = b.length();
        int carry = 0;
        int i;
        for(i = 0; i<Math.min(n1, n2); i++){
            if(a.charAt(i) == '1' && b.charAt(i) == '1'){
                if(carry == 1){
                    res.append("1");
                } else {
                    res.append("0");
                    carry = 1;
                }
            } else if(a.charAt(i) == '1' || b.charAt(i) == '1'){
                if(carry == 1){
                    res.append("0");
                } else {
                    res.append("1");
                }
            } else {
                if(carry == 1){
                    res.append("1");
                    carry = 0;
                } else {
                    res.append("0");
                }
            }
        }
        while(i < n1){
            if(a.charAt(i) == '1'){
                if(carry == 1){
                    res.append("0");
                } else {
                    res.append("1");
                }   
            } else {
                if(carry == 1){
                    res.append("1");
                    carry = 0;
                } else {
                    res.append("0");
                }  
            }
            i++;
        } 
        while(i < n2){
            if(b.charAt(i) == '1'){
                if(carry == 1){
                    res.append("0");
                } else {
                    res.append("1");
                }   
            } else {
                if(carry == 1){
                    res.append("1");
                    carry = 0;
                } else {
                    res.append("0");
                }  
            }
            i++;
        }
        if(carry == 1) res.append("1");
        return new String((new StringBuilder(res)).reverse());
    }
}