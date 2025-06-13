public class majorityelement {
    static int majority(int numbers[]) {
        int n = numbers.length;

        for (int i = 0; i < n; i++) {
            int count = 0;
            for (int j = 0; j < n; j++) {
                if (numbers[i] == numbers[j]) {
                    count++;
                }
            }
            if (count > n / 2) {
                return numbers[i];
            }
        }
        return -1; // No majority element (though problem says one always exists)
    }

    public static void main(String[] args) {
        int numbers[] = {2, 3, 3, 2, 2, 3, 2};
        System.out.println("Majority element is: " + majority(numbers));
    }
}
