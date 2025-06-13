import java.util.*;
public class findnumber {
    public static void main(String[] args) {
        int n = 3;
        int m = 3;
        int numbers[][] = new int[n][m];
        Scanner sc = new Scanner(System.in);

        // Input
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                numbers[i][j] = sc.nextInt();
            }
        }

        // Output
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(numbers[i][j]);
            }
            System.out.println();
        }
        System.out.println("enter number to find in array");
        int target= sc.nextInt();
        for (int i = 0; i <n; i++) {
            for (int j = 0; j <m; j++) {
                if(target==numbers[i][j]){
                    System.out.println("number found"+i+j);
                }
            }
            
        }
    }
}
