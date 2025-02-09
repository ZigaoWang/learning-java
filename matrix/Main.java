public class Main {
    public static void main(String[] args) {
        int[][] mat1 = {
                {2, 4, 2},
                {8, 5, 1},
                {4, 2, 4}
        };
        int[][] mat2 = {
                {-1, 8, 9},
                {6, 3, 5},
                {5, 1, 2}
        };
        int[][] mat3 = {
                {-1, 2, 3},
                {5, 4, 5}
        };
        int[][] mat4 = new int[4][6];
        Matrix a = new Matrix();
        System.out.println(a.diagonalOp(mat1, mat2));
        mat4 = a.expandMatrix(mat3);
        for (int i = 0; i < mat4.length; i++) {
            for (int j = 0; j < mat4[0].length; j++) {
                System.out.print(mat4[i][j] + " ");
            }
            System.out.println();
        }
    }
}