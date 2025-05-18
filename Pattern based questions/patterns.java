public class patterns {
    public static void main(String[] args) {
        int a=5;
        int b=9;
        for (int i = 1; i <=a; i++) {
            for (int j = i; j <=a; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <i; j++) {
                System.out.print(i);
            }
            for (int j = 1; j <=i; j++) {
                System.out.print(i);
            }
             System.out.println();
        }
        for (int i = 6; i <=b; i++) {
            for (int j = 5; j <=i; j++) {
                System.out.print(" ");
            }
            for (int j = i; j <b; j++) {
                System.out.print(i);
                
            }
            for (int j = i; j <=b; j++) {
                System.out.print(i);
                
            }
            System.out.println();
            
        }
    }
}
