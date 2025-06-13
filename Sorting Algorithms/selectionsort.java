public class selectionsort {
    static void selectionsort(int a[]) {
        for (int i = 0; i < a.length - 1; i++) {
            int min = i;
            for (int j = i + 1; j < a.length; j++) {
                if (a[j] < a[min]) {
                    min = j;
                }
            }
            int temp = a[min];
            a[min] = a[i];
            a[i] = temp;
        }

        // Final print of sorted array
        for (int z = 0; z < a.length; z++) {
            System.out.print(a[z] + " ");
        }
    }

    public static void main(String[] args) {
        int a[] = {3, 2, 5, 4, 1};
        selectionsort(a);
    }
}
