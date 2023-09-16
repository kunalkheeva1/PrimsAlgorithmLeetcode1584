public class Main {

    public static void main(String[] args) {
        int [][] points = {{0,0},{2,2},{3,10},{5,2},{7,0}};
        int [][] matrix = Solution.checkMatrix(points);
        for(int i=0; i<matrix.length; i++){
            for(int j=0; j<matrix.length; j++){
                System.out.print(" " + matrix[i][j]);
            }
            System.out.println(" ");
        }
    }
}