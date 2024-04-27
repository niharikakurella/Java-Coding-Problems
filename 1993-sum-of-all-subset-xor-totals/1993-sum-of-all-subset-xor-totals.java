class Solution {
    public int subsetXORSum(int[] nums) {
        int bits=0;
        for(int i=0;i<nums.length;i++){
            bits=bits|nums[i];
        }
        int sum=bits*(int)Math.pow(2,nums.length-1);
        return sum;
    }
}