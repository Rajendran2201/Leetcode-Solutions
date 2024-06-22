class Solution {
    public int nearestValidPoint(int x, int y, int[][] points) {
        int minDistance = Integer.MAX_VALUE, sum = 0, index = -1;
        // check if the point if valid
        for (int i = 0; i < points.length; i++) {
            if (points[i][0] == x || points[i][1] == y) {
                sum = Math.abs((points[i][0] - x) + (points[i][1] - y));
                if (minDistance > sum) {
                    minDistance = sum;
                    index = i;
                }
            }
        }
        return index;
    }
}
