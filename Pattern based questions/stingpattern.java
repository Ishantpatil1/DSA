public class stingpattern {
    public static void main(String[] args) {
       
        String s = "CODER";
        int n=s.length();
        for (int i = 1,P=0; i <=n; i++,P++) {
            for (int j = 1; j <=i; j++) {
                System.out.print(s.charAt(P));
            }
            System.out.println();
        }
    }
}
