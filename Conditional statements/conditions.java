import java.util.*;
class conditions{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("enter a ");
        int a = sc.nextInt();
        System.out.println("enter b ");
        int b = sc.nextInt();
       
        int c= a+b;

        if(c>=30){
            System.out.println("number matched");
        }
        else if (c<30) {
           System.out.println("number not matched");
            
        }
        else{
            System.out.println("number not found");
        }
    }
}