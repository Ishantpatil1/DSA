public class palindrome {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            int a=1;

            for (int j =i; j <=n; j++) {
                System.out.print(" ");
            }
            for (int j = i; j>1; j--) {
                System.out.print(j);
            }
            for (int j = 1; j <=i; j++){
                System.out.print(a++);
            }
            System.out.println();
        }
    }
}
