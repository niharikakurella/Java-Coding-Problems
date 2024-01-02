class Solution {
    public int differenceOfSum(int[] nums) {
        int sum=Arrays.stream(nums).sum();
        int finalCount=0;
        for(int i=0;i<nums.length;i++){
            int count=0;
            while(nums[i]>0){
                int r=nums[i]%10;
                nums[i]=nums[i]/10;
                count=count+r;
            }
            finalCount=finalCount+count;
        }
        return sum-finalCount;
    }
}