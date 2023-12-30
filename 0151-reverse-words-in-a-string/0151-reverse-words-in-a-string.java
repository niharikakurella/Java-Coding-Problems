class Solution {
    public String reverseWords(String s) {
        String res="";
        String[] str=s.trim().split("\\s+");
        for(int i=str.length-1;i>=0;i--){
            if(i==0){
                res+=str[i];
            }else{
                res+=str[i]+" ";
            }
        }
        return res;
    }
}