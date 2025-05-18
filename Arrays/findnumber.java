import  java.util.*;
public class findnumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("enter size: ");
        int size= sc.nextInt();
        int numbers[]= new int[size];

        System.out.println("enter number to find: ");
        int x = sc.nextInt();


        for (int i = 0; i <size; i++) {
            numbers[i]= sc.nextInt();
        }
        for (int i = 0; i <size; i++) {
            if(x==numbers[i]){
                System.out.println(i);
            }
        }
    }
}
