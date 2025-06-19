public class spiralmatrix {
    public void spiral(int[][] numbers) {
        int rowBegin = 0;
        int rowEnd = numbers.length - 1;
        int colBegin = 0;
        int colEnd = numbers[0].length - 1;

        while (rowBegin <= rowEnd && colBegin <= colEnd) {
            // right
            for (int i = colBegin; i <= colEnd; i++) {
                System.out.println(numbers[rowBegin][i]);
            }
            rowBegin++;

            // down
            for (int i = rowBegin; i <= rowEnd; i++) {
                System.out.println(numbers[i][colEnd]);
            }
            colEnd--;

            // left
            if (rowBegin <= rowEnd) {
                for (int i = colEnd; i >= colBegin; i--) {
                    System.out.println(numbers[rowEnd][i]);
                }
                rowEnd--;
            }

            // up
            if (colBegin <= colEnd) {
                for (int i = rowEnd; i >= rowBegin; i--) {
                    System.out.println(numbers[i][colBegin]);
                }
                colBegin++;
            }
        }
    }

    public static void main(String[] args) {
        int[][] numbers = {
            {1,  2,  3,  4,  5},
            {6,  7,  8,  9, 10},
            {11, 12, 13, 14, 15},
            {16, 17, 18, 19, 20},
            {21, 22, 23, 24, 25},
            {26, 27, 28, 29, 30}
        };
        spiralmatrix obj = new spiralmatrix();
        obj.spiral(numbers);
    }
}
