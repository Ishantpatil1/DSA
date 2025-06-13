public class insertionsort {
    public static void insertionSort(int a[]) {
        for (int i = 1; i < a.length; i++) {
            int key = a[i];
            int j = i - 1;

            // Move elements greater than key to one position ahead
            while (j >= 0 && a[j] > key) {
                a[j + 1] = a[j];
                j--;
            }
            a[j + 1] = key;
        }

        // Print the sorted array
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {5, 3, 4, 1, 2};
        insertionSort(a);
    }
}
