public class ArrayResizer {
    public static boolean isNonZeroRow (int[][] array2D, int r) {
        for (int i = 0; i < array2D[r].length; i++) {
            if (array2D[r][i] == 0) {
                return false;
            }
        }
        return true;
    }

    public static int numNonZeroRows (int[][] array2D) {
        int count = 0;
        for (int i = 0; i < array2D.length; i++) {
            if (isNonZeroRow(array2D, i)) {
                count++;
            }
        }
        return count;
    }

    public static int[][] resize (int[][] array2D) {
        int numRows = numNonZeroRows(array2D);
        int numCols = array2D[0].length;
        int[][] res = new int[numRows][numCols];
        int resRow = 0;
        for (int i = 0; i < array2D.length; i++) {
            if (isNonZeroRow(array2D, i)) {
                for (int j = 0; j < numCols; j++) {
                    res[resRow][j] = array2D[i][j];
                }
                resRow++;
            }
        }
        return res;
    }
}
