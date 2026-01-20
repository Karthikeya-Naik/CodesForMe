class Solution {
    public String longestCommonPrefix(String[] strs) {
        if(strs==null || strs.length==0){
            return "";
        }
        String pre=strs[0];
        int len=pre.length();
        for(int i=1;i<strs.length;i++){
            String s=strs[i];
            while(len>s.length() || !pre.equals(s.substring(0,len))){
                len--;
                if(len==0){
                    return "";
                }
                pre=pre.substring(0,len);
            }
        }
        return pre;
    }
}