class Solution {
    public int mostWordsFound(String[] sentences) {
        int max = 0;
        for (String s : sentences) {
            String[] str = s.split(" ");
            if (str.length > max) {
                max = str.length;
            }

        }
        return max;
    }
}