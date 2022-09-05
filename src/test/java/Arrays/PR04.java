package Arrays;

public class PR04 {
    // CREATE a java program to add two matrix of 2*3
    public static void main(String[] args) {
        int[][] mat = {
                // having 2 rows and 3 column
                {1, 2, 3},
                {4, 5, 6}};
        int[][] mat2 = {
                // having 2 rows and 3 column
                {7, 8, 9},
                {9, 8, 7}};
        int[][] result = {
                // we create a one resulting matrix for that
                {0, 0, 0},
                {0, 0, 0}};
        for (int i = 0; i < mat.length; i++) { // row number of times
            for (int j = 0; j < mat[i].length; j++) { // column number of times
                System.out.printf(" setting value for i=%d and j=%d\n", i, j);
                result[i][j] = mat[i][j] + mat2[i][j];
            }
        }
        for (int i = 0; i < mat.length; i++) { // row number of times
            for (int j = 0; j < mat[i].length; j++) { // column number of times
                System.out.printf(result[i][j] + " ");
                result[i][j] = mat[i][j] + mat2[i][j];
            }
            System.out.println("");
        }
    }
}



