class Solution {
    public int[] kWeakestRows(int[][] mat, int k) {
        int[] arr = new int[mat.length];
        int[] res = new int[k];
        for (int i = 0; i < mat.length; i++) {
            int sum = 0;
            for (int j = 0; j < mat[0].length; j++) {
                if (mat[i][j] == 1) {
                    sum++;
                }
            }
            arr[i] = sum * 100 + i;
        }
        Arrays.sort(arr);
        for (int i = 0; i < k; i++) {
            res[i] = arr[i] % 100;
        }
        return res;
    }
}