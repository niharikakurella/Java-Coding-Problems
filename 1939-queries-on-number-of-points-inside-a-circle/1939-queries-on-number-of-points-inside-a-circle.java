class Solution {
    public int[] countPoints(int[][] points, int[][] queries) {
        int[] res = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            res[j] = 0;
            for (int i = 0; i < points.length; i++) {
                if (queries[j][2] >= Math
                        .sqrt(Math.pow(queries[j][0] - points[i][0], 2) + Math.pow(queries[j][1] - points[i][1], 2))) {
                    res[j]++;
                }
            }
        }
        return res;
    }
}