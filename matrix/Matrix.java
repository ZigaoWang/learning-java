public class Matrix {
    public int diagonalOp(int[][] matA, int[][] matB) {
        int ans = 0;
        for (int i = 0; i < matA.length; i++) {
            ans += matA[i][i] * matB[i][i];
        }
        return ans;
    }

    public int[][] expandMatrix(int[][] matA) {
        int[][] matB = new int[4][6];
        for (int i = 0; i < matA.length; i++) {
            for (int j = 0; j < matA[0].length; j++) {
                matB[i * 2][j * 2] = matA[i][j];
                matB[i * 2 + 1][j * 2 + 1] = matA[i][j];
                matB[i * 2 + 1][j * 2] = matA[i][j];
                matB[i * 2][j * 2 + 1] = matA[i][j];
            }
        }
        return matB;
    }
}
