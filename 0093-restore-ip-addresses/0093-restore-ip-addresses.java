class Solution {
    private static final int MAX_IP = 255;
    public List<String> restoreIpAddresses(String s) {
        List<String> ips = new LinkedList<>();
        List<String> currIp = new LinkedList<>();
        populateIps(s, 0, ips, currIp);
        return ips;
    }

    private void populateIps(String s, int start, List<String> ips, List<String> currIp) {

        if(currIp.size() == 4 && start == s.length()) {
            ips.add(getIp(currIp));
            return;
        } if(start >= s.length()) {
            return;
        }  if(s.charAt(start) == '0') {
            currIp.add("0");
            populateIps(s, start+1, ips, currIp);
            currIp.remove(currIp.size()-1);
            return;
        }

        for(int idx = start+1; idx<=s.length(); idx++) {
            String ip = s.substring(start, idx);
            if(Integer.parseInt(ip)<=MAX_IP) {
                currIp.add(ip);
                populateIps(s, idx, ips, currIp);
                currIp.remove(currIp.size()-1);
            } else {
                return;
            }
        } 
    }

    private String getIp(List<String> currIp) {
        String ip = "";
        for(int idx = 0; idx<currIp.size(); idx++) {
            ip += currIp.get(idx) + ".";
        }
        return ip.substring(0, ip.length()-1);
    }
}