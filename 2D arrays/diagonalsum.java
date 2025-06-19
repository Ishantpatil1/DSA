public class diagonalsum {

    // Method to calculate diagonal sum
    public int diagonal(int[][] numbers) {
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (i == j) {
                    sum += numbers[i][j]; // Primary diagonal
                } else if (i + j == numbers.length - 1) {
                    sum += numbers[i][j]; // Secondary diagonal
                }
            }
        }
        return sum;
    }

    public static void main(String[] args) {
        int numbers[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        diagonalsum obj = new diagonalsum();
        int result = obj.diagonal(numbers);
        System.out.println("Sum of diagonals: " + result);
    }
}
