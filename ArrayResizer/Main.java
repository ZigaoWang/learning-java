public class Main {
    public static void main(String[] args) {
        int[][] arr = {{2, 1, 0},
                {1, 3, 2},
                {0, 0, 0},
                {4, 5, 6}};
        System.out.println(ArrayResizer.isNonZeroRow(arr, 0));
        int[][] ans = ArrayResizer.resize(arr);
        for (int i = 0; i < ans.length; i++) {
            for (int j = 0; j < ans[0].length; j++) {
                System.out.print(ans[i][j] + " ");
            }
            System.out.println();
        }
    }
}