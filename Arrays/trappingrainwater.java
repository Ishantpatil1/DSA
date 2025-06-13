public class trappingrainwater {
    static int trappedrainwater(int height[]) {
        int n = height.length;

        // left max height
        int left[] = new int[n];
        left[0] = height[0]; // ✅ corrected: assign value to left[0], not to left[]
        for (int i = 1; i < n; i++) {
            left[i] = Math.max(height[i], left[i - 1]);
        }

        // right max height
        int right[] = new int[n];
        right[n - 1] = height[n - 1]; // ✅ corrected: assign to right[n - 1], not left[n - 1]
        for (int i = n - 2; i >= 0; i--) {
            right[i] = Math.max(height[i], right[i + 1]); // ✅ corrected 'right[i+1]' usage
        }

        // calculate trapped water
        int trappedwater = 0;
        for (int i = 0; i < n; i++) {
            int waterlevel = Math.min(left[i], right[i]);
            trappedwater += waterlevel - height[i]; // ✅ corrected: use += to accumulate water
        }

        return trappedwater;
    }

    public static void main(String[] args) {
        int height[] = {4, 2, 0, 6, 3, 2, 5};
        System.out.println(trappedrainwater(height)); // Expected output: 9
    }
}
