public class Solution {
    public static int[][] checkMatrix(int[][] points){
    int[][] manhattan = new int[points.length][points.length];
        for (int i = 0; i < points.length; i++) {
            for (int j = i + 1; j < points.length; j++) {
                manhattan[i][j] = Math.abs(points[i][0] - points[j][0]) + Math.abs(points[i][1] - points[j][1]);
                manhattan[j][i] = manhattan[i][j];
            }
        }
        return manhattan;
    }
}
