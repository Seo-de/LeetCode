class Solution {
    public int jump(int[] nums) {
        
        int count = 0, currMax = 0, nextMax = 0;
        // currMax : 현재 구간에서 가장 먼 인덱스 / nextMax : 가장 먼 인덱스
        
        for(int i=0; i<nums.length-1; i++){
            nextMax = Math.max(nextMax, i+nums[i]);
            
            if(i == currMax){
                currMax = nextMax;
                count++;
            }
        }
        
        return count;
    }
}