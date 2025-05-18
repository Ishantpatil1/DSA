import java.util.*;
public class findnumber2D {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int rows = sc.nextInt();
        int cols = sc.nextInt();

        int numbers[][]= new int[rows][cols];

        

        for (int i = 0; i <rows; i++) {
            for (int j = 0; j <cols; j++) {
            numbers[i][j]= sc.nextInt();
    }
    }
    System.out.println("enter the number to find: ");
    int x = sc.nextInt();

    for (int i = 0; i <rows; i++) {
        for (int j = 0; j < cols; j++) {
            if(x==numbers[i][j]){
                System.out.println("Number " + x + " found at index (" + i + ", " + j + ")");
            }
        }
    }
}

}
