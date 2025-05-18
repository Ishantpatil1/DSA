public class leftcharactertriangle {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1, P='A'; i <=n; i++,P++) {
            for (int j = i; j <=n; j++) {
                System.out.print((char)P+" ");
            }
            System.out.println();
        }
    }
}
