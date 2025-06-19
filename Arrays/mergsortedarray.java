import java.util.Arrays;

public class mergsortedarray {
    public static int[] merge(int array1[], int array2[]) {
        int n1 = array1.length;
        int n2 = array2.length;
        int merges[] = new int[n1 + n2];

        int i = 0;
        int j = 0;
        int k = 0;

        // Merge both arrays while both have elements
        while (i < n1 && j < n2) {
            if (array1[i] < array2[j]) {
                merges[k++] = array1[i++];
            } else {
                merges[k++] = array2[j++];
            }
        }

        // Add remaining elements from array1
        while (i < n1) {
            merges[k++] = array1[i++];
        }

        // Add remaining elements from array2
        while (j < n2) {
            merges[k++] = array2[j++];
        }

        return merges;
    }

    public static void main(String[] args) {
        int array1[] = {1, 3, 5};
        int array2[] = {2, 3, 4, 6, 7};
        int result[] = merge(array1, array2);
        System.out.println("Merged array is: " + Arrays.toString(result));
    }
}

