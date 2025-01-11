package seatchInRowCol;

public class SearchInRowCol {

    public boolean matSearch(int mat[][], int x) {
        // your code here

        int row = 0, col = mat[0].length-1;

        while (col > -1 && row < mat.length) {

            int value = mat[row][col];
            if (x > value) {
                row ++;
            } else if (x < value) {
                col --;
            } else {
                return true;
            }
        }

        return false;
    }
}
