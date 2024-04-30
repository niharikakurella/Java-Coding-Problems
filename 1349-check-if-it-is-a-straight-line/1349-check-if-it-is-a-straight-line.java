class Solution {
    public boolean checkStraightLine(int[][] coordinates) {
        if (coordinates.length <= 2) {
            return true;
        }
        int x0 = coordinates[0][0], y0 = coordinates[0][1];
        int x1 = coordinates[1][0], y1 = coordinates[1][1];
        for (int i = 2; i < coordinates.length; i++) {
            int x2 = coordinates[i][0], y2 = coordinates[i][1];
            int p1 = (y2 - y1) * (x0 - x1);
            int p2 = (x2 - x1) * (y0 - y1);
            if (p1 != p2)
                return false;
        }
        return true;
    }
}