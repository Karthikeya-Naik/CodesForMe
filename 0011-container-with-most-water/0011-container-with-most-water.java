class Solution {
    public int maxArea(int[] h) {
        int left=0;
        int right=h.length-1;
        int maxArea=0;
        while(left<right){
            int curr=Math.min(h[left], h[right]) * (right-left);
            maxArea=Math.max(maxArea, curr);
            if(h[left]<h[right]){
                left++;
            }
            else{
                right--;
            }
        }
        return maxArea;
    }
}