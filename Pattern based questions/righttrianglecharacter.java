public class righttrianglecharacter {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
           int  P='A';
            for (int j = 1; j <=i; j++) {
                System.out.print((char)P++);
            }
            System.out.println();
        }
    }
}
