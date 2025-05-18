public class leftevencharacter {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1,P='A'; i <=n; i++,P+=2) {
            for (int j = 1; j <=i; j++) {
                System.out.print((char)P);
            }
            System.out.println();
        }
    }
}
