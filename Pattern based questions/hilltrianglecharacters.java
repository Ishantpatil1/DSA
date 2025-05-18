public class hilltrianglecharacters {
    public static void main(String[] args) {
        int n=5;
        for (int i = 1; i <=n; i++) {
            int P='A';
            for (int j = i; j <=n; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <i; j++) {
                System.out.print((char)P++);
            }
            for (int j = 1; j <=i; j++) {
                System.out.print((char)P++);
            }
            System.out.println();
        }
    }
}
