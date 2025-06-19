public class searchsortedmatrix {
    public void search(int[][] numbers, int target) {
        boolean found = false;

        for (int i = 0; i < numbers.length; i++) {
            for (int j = 0; j < numbers[i].length; j++) {
                if (numbers[i][j] == target) {
                    found = true;
                    break; // exit inner loop
                }
            }
            if (found) {
                break; // exit outer loop
            }
        }

        if (found) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
    }

    public static void main(String[] args) {
        int numbers[][] = {
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
        };

        int target = 11;
        searchsortedmatrix obj = new searchsortedmatrix();
        obj.search(numbers, target);
    }
}
