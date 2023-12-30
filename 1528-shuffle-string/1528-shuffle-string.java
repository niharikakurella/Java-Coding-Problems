class Solution {
    public String restoreString(String s, int[] indices) {
        String res = "";
        char[] c1 = new char[s.length()];
        for (int i = 0; i < indices.length; i++) {
            c1[indices[i]] = s.charAt(i);
        }
        for (int i = 0; i < c1.length; i++) {
            res += c1[i];
        }
        return res;
    }
}