package Algorithm_and_Structure;

//По условиям задачи: необходимо посчитать количество островов в матрице.
// Островом считаются единицы (1), которые находятся друг рядом с другом по
// горизонтали и по вертикали. Водой считаются ячейки матрицы с нулями.

public class IslandCount {
    public static void main(String[] args) {
        int[][] array1 = {
                {1, 1, 1, 1, 0, 0},
                {1, 1, 1, 0, 0, 0},
                {1, 1, 0, 0, 0, 0},
                {0, 0, 0, 0, 1, 1}
        };

        int[][] array2 = {
                {0, 0, 1, 1, 0, 0},
                {0, 1, 1, 1, 0, 0},
                {0, 0, 0, 0, 1, 0},
                {0, 1, 1, 1, 0, 0}
        };

        int[][] array3 = {
                {1, 0, 1, 1, 0, 1},
                {1, 0, 1, 1, 0, 0},
                {0, 0, 0, 0, 0, 0},
                {0, 1, 1, 1, 0, 0}
        };

        System.out.println(countOfIsland(array3));
    }

    private static int countOfIsland(int[][] arr) {
        int row = arr.length;
        int col = arr[0].length;
        int counter = 0;
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < col; j++) {
                if (arr[i][j] == 1) {
                    counter++;
                    checkNeighbour(arr, i, j);
                }
            }
        }
        return counter;
    }

    private static void checkNeighbour(int[][] arr, int row, int col) {
        arr[row][col] = 5;
        if (((row - 1) >= 0) && arr[row - 1][col] == 1) checkNeighbour(arr, row - 1, col);
        if ((row + 1 < arr.length) && arr[row + 1][col] == 1) checkNeighbour(arr, row + 1, col);
        if (((col - 1) >= 0) && arr[row][col - 1] == 1) checkNeighbour(arr, row, col - 1);
        if (((col + 1) < arr[0].length) && arr[row][col + 1] == 1) checkNeighbour(arr, row, col + 1);
    }
}
