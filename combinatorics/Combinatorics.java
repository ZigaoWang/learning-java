public class Combinatorics {
    public static int factorial(int n) {
        if (n == 0 || n == 1) return 1;
        return n * factorial(n - 1);
    }

    public static void numCombinators(int n, int r) {
        if (r > n) {
            System.out.println("There are 0 ways of choosing " + r + " items from " + n + " choices.");
            return;
        }

        int top = factorial(n);
        int bottom1 = factorial(r);
        int bottom2 = factorial(n - r);
        int ans = top / (bottom1 * bottom2);

        System.out.println("There are " + ans + " ways of choosing " + r + " items from " + n + " choices.");
    }
}
