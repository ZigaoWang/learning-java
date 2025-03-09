public class APLine {
    private int a, b, c;
    public APLine(int a, int b, int c) {
        a = this.a;
        b = this.b;
        c = this.c;
    }
    public double getSlope() {
        return -((double) a / b);
    }
    public boolean isOnLine(int x, int y) {
        return (a * x + b * y + c == 0);
    }
}
