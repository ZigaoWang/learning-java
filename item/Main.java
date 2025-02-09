public class Main {
    public static void main(String[] args) {
        Item[][] grid = new Item[3][4];

        grid[0][0] = new Item("acorn", 7);
        grid[0][1] = new Item("book", 10);
        grid[0][2] = new Item("carrot", 8);
        grid[0][3] = new Item("desk", 9);

        grid[1][0] = new Item("egg", 5);
        grid[1][1] = new Item("flag", 8);
        grid[1][2] = new Item("globe", 8);
        grid[1][3] = new Item("harp", 9);

        grid[2][0] = new Item("island", 7);
        grid[2][1] = new Item("jacket", 19);
        grid[2][2] = new Item("kale", 8);
        grid[2][3] = new Item("lunch", 16);

        ItemGrid ig = new ItemGrid(grid);

        System.out.println(ig.mostValuableNeighbor(0, 2));
        System.out.println(ig.mostValuableNeighbor(1, 1));
        System.out.println(ig.mostValuableNeighbor(2, 0));
        System.out.println(ig.mostValuableNeighbor(2, 3));

        System.out.println(ig.findAverage());
    }
}