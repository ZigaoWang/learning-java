public class ItemGrid {
    private Item[][] grid;
    public ItemGrid(Item[][] a) {
        grid = new Item[3][4];
        grid = a;
    }

    public boolean isValid(int xPos, int yPos) {
        if (xPos >= 0 && xPos <= 2 && yPos >= 0 && yPos <= 3) return true;
        else return false;
    }

    public String mostValuableNeighbor(int r, int c) {
        int left = -1;
        int right = -1;
        int mid = grid[r][c].getValue();
        if (isValid(r, c - 1)) left = grid[r][c - 1].getValue();
        if (isValid(r, c + 1)) right = grid[r][c + 1].getValue();
        if (left > right) {
            if (left > mid) return grid[r][c - 1].getName();
            else return grid[r][c].getName();
        }
        else {
            if (right > mid) return grid[r][c + 1].getName();
            else return grid[r][c].getName();
        }
    }

    public double findAverage() {
        int sum = 0;
        int count = 0;
        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                sum += grid[i][j].getValue();
                count++;
            }
        }
        return (double) sum / count;
    }
}
