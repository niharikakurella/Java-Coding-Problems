class Solution {
    public int sumBase(int n, int k) {
        int sum=0;
            while(n>0){
                int r=n%k;
                n=n/k;
                sum+=r;
            }
       return sum;
    }
}