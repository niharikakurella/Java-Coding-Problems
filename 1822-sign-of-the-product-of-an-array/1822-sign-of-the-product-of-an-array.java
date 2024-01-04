import java.math.BigInteger;
class Solution {
    public int arraySign(int[] nums) {
        BigInteger prod = BigInteger.ONE;
        for (int i = 0; i < nums.length; i++) {
            prod = prod.multiply(BigInteger.valueOf(nums[i]));
        }
               return prod.signum();
    }
}