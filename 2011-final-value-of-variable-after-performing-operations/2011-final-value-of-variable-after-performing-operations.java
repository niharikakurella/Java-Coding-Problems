class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int sum=0;
        for(String s:operations){
            if(s.charAt(0)=='+' || s.charAt(2)=='+'){
                sum++;
            }
            else{
                sum--;
            }
        }
        return sum;
    }
}