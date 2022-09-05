package Arrays;

public class MultidimentionalArray {
    public static void main(String[] args) {
        // multidimentional array is array of array
        int[][] flats;
        flats = new int[2][3];
        // 2 rows and 3 column
        flats[0][0] = 100;
        flats[0][1] = 200;
        flats[0][2] = 30000;
        flats[1][0] = 100;
        flats[1][1] = 200;
        flats[1][2] = 300;
        // length get from rows count
        for(int i=0;i<flats.length;i++){
            for(int j=0;j<flats[i].length;j++)
            System.out.print(flats[i][j]);
            System.out.print("  ");
        }
        System.out.println("");
    }
}
