class Solution {
    public boolean isAnagram(String s, String t) {
        char[] cs = s.toCharArray();
        char[] ct = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ct);
        int i=0;
        if(s.length()!=t.length()){
            return false;
        }
        while(i<s.length() && i<t.length()){
            if(cs[i]!=ct[i])
            return false;
            i++;
        }
        return true;
    }
}
