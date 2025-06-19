public class repeatandmissing {

    public void repeat(int numbers[]) {
        int repeat = 0;
        int missing = 0;
        int n = numbers.length;
        int count[] = new int[n + 1];

        for (int i = 0; i < n; i++) {
            count[numbers[i]]++;
        }

        for (int i = 1; i <= n; i++) {
            if (count[i] == 0) {
                missing = i;
            } else if (count[i] == 2) {
                repeat = i;
            }
        }

        System.out.println("Missing number is: " + missing);
        System.out.println("Repeating number is: " + repeat);
    }

    public static void main(String[] args) {
        int numbers[] = {1, 2, 3, 2, 5};
        repeatandmissing obj = new repeatandmissing();
        obj.repeat(numbers);
    }
}
